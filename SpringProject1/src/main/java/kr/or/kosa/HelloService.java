package kr.or.kosa;

import org.springframework.stereotype.Controller;

public class HelloService  {

	public String sayHello(String name) {
		String message =  name + " / 핵심기능(Core Concern) 동작 "; 
		return message;
	}

	public String exceptFunction(int name) {
		String message = "예외를 발생시킵니다. " + name;
		return message;
	}
	
}
