package clientmanage;



import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.company.service.IClientService;

public class CRMTest {
	@Test
	public void t1(){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
		IClientService detailService  = context.getBean(IClientService.class);
		System.out.println(detailService.findById(1002));
		}

}
