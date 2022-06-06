package jk.spring.collection;

import java.util.Properties;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {

	public static void main(String[] args) {
		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("applicationContext.xml");
		CollectionBean bean = (CollectionBean) factory.getBean("collectionbean");
		
		Properties addressList = bean.getAddressList();
		for(String key : addressList.stringPropertyNames()) {
			System.out.println(String.format("Ű : %s, �� : %s", key,addressList.get(key)));
		}
		factory.close();
	}

}
