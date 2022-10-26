package ch07;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=1; i<=5;i++) {
			int problemLocation = car.run(); //사고가 없으면 return 0; 사고가 발생하면 return i+1;(1,2,3,4)
			if(problemLocation !=0) { //problemLocation이 0이 아니면 (== 타이어에 사고가 발생하면)
				System.out.println(car.tires[problemLocation-1].location+" HankookTire로 교체"); //car.tires[i]를 교체
				car.tires[problemLocation-1] = new HankookTire(car.tires[problemLocation-1].location, 15); //tires[i](location, maxRotation)
			}
			System.out.println("---------------------------------------");
		}

	}

}
