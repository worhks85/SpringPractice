package jk.spring.polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		// 1. Spring Container�� ���ؿ´�.
		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("applicationContext.xml");
		// 2. Spring Container�� ���� �ʿ��� ��ü�� ���´�.
		TV tv = (TV) factory.getBean("tv");
		
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		// 3. Spring Container�� ������.
		factory.close();
		
	}
}
