package clientmanage;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.company.pojo.Order;
import com.company.service.IOrderService;

/**
 * @category 合同订单测试类
 * @author Administrator
 *
 */

public class OrderTest {
	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
		IOrderService orderService = context.getBean(IOrderService.class);
		//Order order = orderService.findByPid(4);
		//System.out.println(order);
	    //List<Order> list = orderService.findAll();
		//System.out.println(list.size());
		//System.out.println(orderService.find(1));
		//Order order = orderService.find(2);
		//order.setTotalprice("10022223");
		//System.out.println(orderService.updata(order));
		//System.out.println(orderService.delete(1));
		
	}
}
