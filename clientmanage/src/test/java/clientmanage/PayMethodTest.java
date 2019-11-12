package clientmanage;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.company.pojo.PayMethod;
import com.company.service.IOrderService;
import com.company.service.IPayMethodService;

/**
 * @category 付款方式测试
 * @author zhangyang
 *
 */

public class PayMethodTest {
	@Test
	public void test(){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
		IPayMethodService payMethodService = context.getBean(IPayMethodService.class); 
		//System.out.println(payMethodService.find(1));
		List<PayMethod> list = payMethodService.findAll();
		for (PayMethod payMethod : list) {
			System.out.println(payMethod.getId());
		}
	}
}
