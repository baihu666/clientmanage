package clientmanage;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.company.dao.IClientDao;
import com.company.pojo.Client;

/**
 * @author hzm
 * @category 客户实体类测试
 */
public class ClientTest {

	@Test
	public void test(){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
		IClientDao clientDao = context.getBean(IClientDao.class);
		List<Client> list = clientDao.findAll();
		for (Client client : list) {
			System.out.println(client.getName());
		}
	}
}
