package jk.spring.polymorphism;

public class SamsungTV implements TV{
	private Speaker speaker;
	private int price ;
	
	public SamsungTV(Speaker speaker) {
		System.out.println("SamsungTV ��ü���� : ������ Injection");
		this.speaker = speaker;
	}
	
	public SamsungTV() {
		System.out.println("SamsungTV ��ü����");
	}

	public SamsungTV(Speaker speaker, int price) {
		System.out.println("SamsungTV ��ü���� : ������ Injection - ���߸���");
		this.speaker = speaker;
		this.price = price;
	}

	public void powerOn() {
		System.out.println("SamsungTV ������ �Ҵ�. (���� : " + price);
	}
	public void powerOff() {
		System.out.println("SamsungTV ������ ����.");
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
		System.out.println("SetSpeaker �޼��� ȣ��");
		this.speaker = speaker;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		System.out.println("Setprice �޼��� ȣ��");
		this.price = price;
	}
	
}
