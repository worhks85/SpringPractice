package jk.spring.polymorphism;

public class LGTV implements TV{
	public void powerOn() {
		System.out.println("LGTV 전원을 켠다.");
	}
	public void powerOff() {
		System.out.println("LGTV 전원을 끈다.");
	}
	public void volumeUp() {
		System.out.println("LGTV 소리를 키운다.");
	}
	public void volumeDown() {
		System.out.println("LGTV 소리를 줄인다.");
	}
	public LGTV() {
		System.out.println("LGtv 객체 생성");
	}
}
