package com.company.logger;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang.StringUtils;

public class MapperUtil {
	
	public static String toJsonStr(Map<String,String[]> map){
	       Set<String> keySet = map.keySet();
	       //将set集合转换为数组
	       String[] keyArray = keySet.toArray(new String[keySet.size()]);
//	       //给数组排序(升序)
	       Arrays.sort(keyArray,Collections.reverseOrder());
	       
	       //因为String拼接效率会很低的，所以转用StringBuilder
	       StringBuilder sb = new StringBuilder();
	       for (int i = 0; i < keyArray.length; i++) {
	           // 参数值为空，则不参与签名 这个方法trim()是去空格
	           if ((String.valueOf(map.get(keyArray[i]))).trim().length() > 0) {
//	               sb.append(keyArray[i]).append(":").append(String.valueOf(map.get(keyArray[i])).trim());
	        	   sb.append(keyArray[i]).append(":").append(StringUtils.join(map.get(keyArray[i])));
	           }
	           if(i != keyArray.length-1){
	               sb.append(",");
	           }
	       }
	       return sb.toString();
}
}