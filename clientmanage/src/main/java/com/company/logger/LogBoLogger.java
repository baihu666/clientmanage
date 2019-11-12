package com.company.logger;

import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.company.pojo.LogBo;
import com.company.pojo.Staff;
import com.company.service.ILogBoService;

/**
 * @author Johnny
 * @category 业务逻辑的日志类
 */
@Component
@Aspect
public class LogBoLogger {
	
	 // 注入service,用来将日志信息保存在数据库
    @Resource
    private ILogBoService logBoService;

	private static final Logger log = Logger.getLogger(LogBoLogger.class);


	
	@Autowired
	private  HttpServletRequest request;
	

	public Object aroundLogger(ProceedingJoinPoint pjp) throws Throwable {
		//日志实体对象
        LogBo logBo = new LogBo();
        // 从session获取用户名
        Object obj = request.getSession().getAttribute("current_staff");
        String uname = "";
        if (obj==null) {
			uname = "游客";
		} else {
			uname = ((Staff) obj).getName();
		}
      
        logBo.setUname(uname);
        System.err.println("uname:"+uname);
        // 获取系统当前时间
        logBo.setDate(new Date());
        
     // 获取访问真实IP    
        String ipAddress = request.getHeader("x-forwarded-for");  
        if(ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {  
            ipAddress = request.getHeader("Proxy-Client-IP");  
        }  
        if(ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {  
            ipAddress = request.getHeader("WL-Proxy-Client-IP");  
        }  
        if(ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {  
            ipAddress = request.getRemoteAddr();  
            if(ipAddress.equals("127.0.0.1") || ipAddress.equals("0:0:0:0:0:0:0:1")){  
                //根据网卡取本机配置的IP  
                InetAddress inet=null;  
                try {  
                    inet = InetAddress.getLocalHost();  
                } catch (UnknownHostException e) {  
                    e.printStackTrace();  
                }  
                ipAddress= inet.getHostAddress();  
            }  
        }  
        //对于通过多个代理的情况，第一个IP为客户端真实IP,多个IP按照','分割  
        if(ipAddress!=null && ipAddress.length()>15){ //"***.***.***.***".length() = 15  
            if(ipAddress.indexOf(",")>0){  
                ipAddress = ipAddress.substring(0,ipAddress.indexOf(","));  
            }  
        }  
            
        logBo.setIp(ipAddress);
        System.err.println("ipAddress:"+ipAddress);
     // 拦截的实体类，就是当前正在执行的controller
        Object target = pjp.getTarget();
        // 拦截的方法名称。当前正在执行的方法
        String methodName = pjp.getSignature().getName();
        System.err.println("methodName:"+methodName);
        // 拦截的方法参数
        Object[] args = pjp.getArgs();
        
        //获取请求路径
        String actionUrl = request.getRequestURI();    
        System.err.println("actionUrl:"+actionUrl);
        
        // 拦截的放参数类型
        Signature sig = pjp.getSignature();
        MethodSignature msig = null;
        if (!(sig instanceof MethodSignature)) {
            throw new IllegalArgumentException("该注解只能用于方法");
        }
        msig = (MethodSignature) sig;
        Class[] parameterTypes = msig.getMethod().getParameterTypes();

        System.err.println("parameterTypes:"+parameterTypes);
        
        Object object = null;
        // 获得被拦截的方法
        Method method = null;
        
        
        try {
            method = target.getClass().getMethod(methodName, parameterTypes);
        } catch (NoSuchMethodException e1) {
            e1.printStackTrace();
        } catch (SecurityException e1) {
            e1.printStackTrace();
        }
        if (null != method) {
            // 获取方法（此为自定义注解） 
           OptionalLog op = method.getAnnotation(OptionalLog .class);
    
            // 获取注解的modules 设为操作模块
            logBo.setModule(op.modules());        
            // 获取注解的methods 设为执行方法
            logBo.setMethods(op.methods());    
            // 将上面获取到的请求路径 设为请求路径
            logBo.setActionurl(actionUrl);
            try {
                object = pjp.proceed();
                //接受客户端的数据
                Map<String,String[]> map = request.getParameterMap(); 
                // 解决获取参数乱码
                Map<String,String[]> newmap = new HashMap<String,String[]>();   
                for(Map.Entry<String, String[]> entry : map.entrySet()){
                String name = entry.getKey();
                String values[] = entry.getValue();

                if(values==null){
                newmap.put(name, new String[]{});
                continue;
                }
                String newvalues[] = new String[values.length];
                for(int i=0; i<values.length;i++){
                String value = values[i];
                value = new String(value.getBytes("iso8859-1"),request.getCharacterEncoding());
                newvalues[i] = value; //解决乱码后封装到Map中
                }

                newmap.put(name, newvalues);
                
                }
                logBo.setContent(MapperUtil.toJsonStr(newmap));
                //1为执行成功
                logBo.setCommite((byte) 1);
                // 添加到数据库
                logBoService.add(logBo);
            } catch (Throwable e) {
              
            	//接受客户端的数据
                Map<String,String[]> map = request.getParameterMap();  
                // 解决获取参数乱码
                Map<String,String[]> newmap = new HashMap<String,String[]>();   
                for(Map.Entry<String, String[]> entry : map.entrySet()){
                String name = entry.getKey();
                String values[] = entry.getValue();

                if(values==null){
                newmap.put(name, new String[]{});
                continue;
                }
                String newvalues[] = new String[values.length];
                for(int i=0; i<values.length;i++){
                String value = values[i];
                value = new String(value.getBytes("iso8859-1"),request.getCharacterEncoding());
                newvalues[i] = value; //解决乱码后封装到Map中
                }

                newmap.put(name, newvalues);
                
                }
                //MapperUtil.toJsonStr为自定义的转换工具类
                logBo.setContent(MapperUtil.toJsonStr(newmap));
                //2为执行失败
                logBo.setCommite((byte) 2);
                //添加到数据库
                logBoService.add(logBo);
            }
        }
        return object;

        
        
		
	}
}
