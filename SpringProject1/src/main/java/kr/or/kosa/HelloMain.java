package kr.or.kosa;

import java.io.IOException;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloMain {
	public static void main(String[] args) throws IOException {
		
		AbstractApplicationContext context 
			= new GenericXmlApplicationContext("applicationContext.xml");
		
		HelloController controller = context.getBean(HelloController.class);
		controller.hello("KOSA");
		context.close();
	}
}
