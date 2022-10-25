package ch07;

public class CarExample {

	public static void main(String[] args) {                   //Car 객체 생성
		Car car = new Car();
		for(int i=1; i<=5;i++) {                 //Car 객체의 run() 메소드 5번 반복 실행
			int problemLocation = car.run();  //Car의 run 실행 -> Tire 클래스에서 각각의 바퀴에 roll 실행(최대 회전수 - 누적 회전수)
			
			switch(problemLocation) {
			case 1:
				System.out.println("앞왼쪽 HankookTire로 교체");
				car.frontLeftTire = new HankookTire("앞왼쪽", 15);
				break;
			case 2:
				System.out.println("앞오른쪽 KumhoTire로 교체");
				car.frontRightTire = new KumhoTire("앞오른쪽", 13);
				break;
			case 3:
				System.out.println("뒤왼쪽 HankookTire로 교체");
				car.backLeftTire = new HankookTire("뒤왼쪽", 14);
				break;
			case 4:
				System.out.println("뒤오른쪽 KumhoTire로 교체");
				car.backRightTire = new KumhoTire("뒤오른쪽", 17);
				break;
			}
			System.out.println("------------------------------"); //1회전 시 출력되는 내용을 구분
		}

	}

}
