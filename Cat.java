package ch07;

public class Cat extends Animal{
	public Cat() {
		this.kind="������";
	}
	
	@Override
	public void sound() {            //�߻� �޼ҵ� ������
		System.out.println("�߿�");
	}
}
