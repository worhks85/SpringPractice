package jk.spring.polymorphism;

public class SamsungTV implements TV{
	private Speaker speaker;
	private int price ;
	
	public SamsungTV(Speaker speaker) {
		System.out.println("SamsungTV 객체생성 : 생성자 Injection");
		this.speaker = speaker;
	}
	
	public SamsungTV() {
		System.out.println("SamsungTV 객체생성");
	}

	public SamsungTV(Speaker speaker, int price) {
		System.out.println("SamsungTV 객체생성 : 생성자 Injection - 다중매핑");
		this.speaker = speaker;
		this.price = price;
	}

	public void powerOn() {
		System.out.println("SamsungTV 전원을 켠다. (가격 : " + price);
	}
	public void powerOff() {
		System.out.println("SamsungTV 전원을 끈다.");
	}
	
	public void volumeUp() {
		speaker.volumeUp();
	}
	
	public void volumeDown() {
		speaker.volumeDown();
	}
	
	
	public Speaker getSpeaker() {
		return speaker;
	}
	public void setSpeaker(Speaker speaker) {
		System.out.println("SetSpeaker 메서드 호출");
		this.speaker = speaker;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		System.out.println("Setprice 메서드 호출");
		this.price = price;
	}
	
}
