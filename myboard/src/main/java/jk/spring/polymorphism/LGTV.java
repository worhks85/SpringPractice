package jk.spring.polymorphism;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tv")
public class LGTV implements TV{
	@Autowired
	private Speaker speaker ;
	public void powerOn() {
		System.out.println("LGTV 전원을 켠다.");
	}
	public void powerOff() {
		System.out.println("LGTV 전원을 끈다.");
	}
	public void volumeUp() {
		speaker.volumeUp();
	}
	public void volumeDown() {
		speaker.volumeDown();
	}
	public LGTV() {
		System.out.println("LGTV 객체 생성");
	}
}
