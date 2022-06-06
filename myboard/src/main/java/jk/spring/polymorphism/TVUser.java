package jk.spring.polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		// 1. Spring Container를 구해온다.
		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("applicationContext.xml");
		// 2. Spring Container로 부터 필요한 객체를 얻어온다.
		TV tv = (TV) factory.getBean("tv");
		
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		// 3. Spring Container를 종료함.
		factory.close();
		
	}
}
