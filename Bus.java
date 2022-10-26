package ch07;

//Vehicle의 자식클래스
public class Bus extends Vehicle {
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
}
