package clientmanage;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.company.pojo.Produce;
import com.company.pojo.vo.ProduceVO;
import com.company.service.IProduceService;

/**
 * @author Vimi
 * @category 产品测试类
 */
public class ProduceTest {
	
	@Test
	public void test(){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
		IProduceService produceService = context.getBean(IProduceService.class);
		//System.out.println(produceService.findList().size());
		//System.out.println(produceService.findById(2).getDesc());
		//List<Produce> list = produceService.findByName("天"); 
		//System.out.println(list);
		//for (Produce produce : list) {
		//	System.out.println(produce.getName());
		//}
		List<ProduceVO> list = produceService.findListByStatus(2);
		for (ProduceVO produce : list) {
			System.out.println(produce.getName());
		}
		//System.out.println(produceService.findListByKind(2).size());
		//produceService.addProduce("陀螺仪","699",2,"陀螺仪",2);
		//produceService.updateProduce(8,"红外发射器","177",2,"红外发射器",2);
		//int []arrays = {6};
		//produceService.deleteProduce(arrays);
		//produceService.upateStatus(2, 1);
	}
}
