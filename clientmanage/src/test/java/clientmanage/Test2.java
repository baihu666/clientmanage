package clientmanage;


import java.sql.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.company.dao.ILogDao;
import com.company.pojo.Log;

public class Test2 {
	@Test
	public void test() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/spring.xml");
		ILogDao logDao = applicationContext.getBean(ILogDao.class);
		List<Log> list = logDao.findByUid(1);
		for (Log log : list) {
			System.out.println(log.getContent());
		}
		Log log = logDao.findById(2);
		System.out.println(log.getUid());
	}
	@Test
	public void test1(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/spring.xml");
		ILogDao logDao = applicationContext.getBean(ILogDao.class);
		Log log = new Log(1,"hao",new Date(new java.util.Date().getTime()));
		logDao.add(log);
	}
}
