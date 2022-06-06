package jk.spring.polymorphism;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tv")
public class LGTV implements TV{
	@Autowired
	private Speaker speaker ;
	public void powerOn() {
		System.out.println("LGTV ������ �Ҵ�.");
	}
	public void powerOff() {
		System.out.println("LGTV ������ ����.");
	}
	public void volumeUp() {
		speaker.volumeUp();
	}
	public void volumeDown() {
		speaker.volumeDown();
	}
	public LGTV() {
		System.out.println("LGTV ��ü ����");
	}
}
