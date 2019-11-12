package clientmanage;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.company.pojo.ProduceKind;
import com.company.service.IProduceKindService;

/**
 * @author Vimi
 * @category 产品类别测试类
 */
public class ProduceKindTest {
	
	@Test
	public void test(){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
		IProduceKindService produceKindService = context.getBean(IProduceKindService.class);
		System.out.println(produceKindService.findList().size());
		//System.out.println(produceKindService.findById(3).getName());
		//ProduceKind produceKind = new ProduceKind("精密仪器");
		//produceKindService.addKind(produceKind);
		//ProduceKind produceKind = new ProduceKind(6,"小太阳");
		//produceKindService.updateKind(produceKind);
		//int[] arr = {7};
		//produceKindService.deleteKind(arr);
	}
}
