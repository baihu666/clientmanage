package clientmanage;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.company.pojo.Staff;
import com.company.service.IStaffService;

/**
 * @author Vimi
 * @category 产品状态测试类
 */
public class ProduceStatusTest {

	@Test
	public void test() {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
		IStaffService produceStatusService = context.getBean(IStaffService.class);
		Staff staff = produceStatusService.find1("admin", "111");
		boolean flag = produceStatusService.update(staff);
		System.out.println(flag);
	}
}
