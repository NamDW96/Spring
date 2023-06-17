package kr.or.kosa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloController {
	
	HelloService helloService;
	
	public void setHelloService(HelloService helloService) {
		this.helloService = helloService;
	}
	
	public void hello(String name) {
		String result = helloService.sayHello(name);
		System.out.println(result);
	}
	
	public void except(int name) throws NumberFormatException, IOException {
		String result = helloService.exceptFunction(name);
		System.out.println(result);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int errornum = Integer.parseInt(br.readLine());
	}
	
}
