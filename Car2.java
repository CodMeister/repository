package ch07;

public class Car {
	//필드
	Tire[] tires= {
			new Tire("앞왼쪽", 6), //tires[0]
			new Tire("앞오른쪽", 2), //tires[1]
			new Tire("뒤왼쪽", 3), //tires[2]
			new Tire("뒤오른쪽", 4) //tires[3]
	};
	
	//메소드
	int run() {
		System.out.println("[자동차가 달립니다.]");
		for(int i=0;i<tires.length;i++) { //tires[0]~tires[3]에 대하여
			if(tires[i].roll()==false) { //tires[i].roll()이 false를 리턴하면
				stop();
				return(i+1); //i+1을 리턴한다.
			}
		}
		return 0;
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}
