package jk.spring.polymorphism;

public class LGTV implements TV{
	public void powerOn() {
		System.out.println("LGTV ������ �Ҵ�.");
	}
	public void powerOff() {
		System.out.println("LGTV ������ ����.");
	}
	public void volumeUp() {
		System.out.println("LGTV �Ҹ��� Ű���.");
	}
	public void volumeDown() {
		System.out.println("LGTV �Ҹ��� ���δ�.");
	}
	public LGTV() {
		System.out.println("LGtv ��ü ����");
	}
}
