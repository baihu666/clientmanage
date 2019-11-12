package clientmanage;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.company.dao.IOstatusDao;
import com.company.pojo.Ostatus;

public class asgjkd {
	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
		IOstatusDao dao = context.getBean(IOstatusDao.class);
		List<Ostatus> list = dao.findAll();
		for (Ostatus ostatus : list) {
			System.out.println(ostatus.getName());
		}
	}
}
