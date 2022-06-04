package jk.spring.polymorphism;

public class BeanFactory {
	public Object getBean(String name) {
		if(name.equals("samsung")) {
			return new SamsungTV();
		}else if (name.equals("lg")) {
			return new LGTV();
		}
		return null;
	}


}
