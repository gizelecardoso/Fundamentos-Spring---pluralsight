import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pluralsight.service.CustomerService;

public class Application {

	public static void main(String[] args) {
		
		//CustomerService service = new CustomerServiceImpl();
		
		//chamando o caminho para o xml criado.
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//referencia ao bean de atendimento.
		CustomerService service = appContext.getBean("customerService", CustomerService.class);//pegamos o nome do arquivo e classe para nao precisarmos fazer um cast.
		
		System.out.println(service);
		
		
		CustomerService service2 = appContext.getBean("customerService", CustomerService.class);//pegamos o nome do arquivo e classe para nao precisarmos fazer um cast.

		System.out.println(service2);
		
		System.out.println(service.findAll().get(0).getFirstname());
	
	}

}
