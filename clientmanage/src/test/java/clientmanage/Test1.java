package clientmanage;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.company.dao.IAreaDao;
import com.company.dao.ICityDao;
import com.company.dao.IProvinceDao;
import com.company.pojo.Area;
import com.company.pojo.City;
import com.company.pojo.Province;

/**
 * @author hzm
 * @category 省市
 */
public class Test1{

//	@Test
//	public void test() {
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
//		ICityDao cityDao = context.getBean(ICityDao.class);
//		List<City> list = cityDao.findCitiesByPid("130000");
//		for (City city : list) {
//			System.out.println(city.getCity());
//		}
//	}
	
//	@Test
//	public void test1(){
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
//		IProvinceDao provinceDao = context.getBean(IProvinceDao.class);
//		List<Province> list = provinceDao.findAll();
//		for (Province province : list) {
//			System.out.println(province.getProvince());
//		}
//	}
//	@Test
//	public void test2() {
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
//		ICityDao cityDao = context.getBean(ICityDao.class);
////		List<City> list =  cityDao.findObject("110100");
//		for (City city : list) {
//			System.out.println(city.getCity());
//		}
//	}
}
