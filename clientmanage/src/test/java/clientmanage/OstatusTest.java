package clientmanage;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.company.dao.IAreaDao;
import com.company.dao.IOstatusDao;
import com.company.pojo.Area;
import com.company.pojo.Ostatus;

/**
 * @author Administrator
 * @category 供应商状态测试
 */
public class OstatusTest {
	@Test
	public void test(){
			ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
			IOstatusDao ostatuDao = context.getBean(IOstatusDao.class);
			List<Ostatus> list = ostatuDao.findAll();
			for (Ostatus ostatu : list) {
				System.out.println(ostatu.getId());
			}
	}	
}
