package ch07;

//Vehicle의 자식클래스
public class Taxi extends Vehicle{
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
}
