package jk.spring.polymorphism;

public class LGTV implements TV{
	@Override
	public void powerOn() {
		System.out.println("LGTV ������ �Ҵ�.");
	}
	@Override
	public void powerOff() {
		System.out.println("LGTV ������ ����.");
	}
	@Override
	public void volumeUp() {
		System.out.println("LGTV �Ҹ��� Ű���.");
	}
	@Override
	public void volumeDown() {
		System.out.println("LGTV �Ҹ��� ���δ�.");
	}
}
