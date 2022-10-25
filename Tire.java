package ch07;

public class Tire {
	//필드
	public int maxRotation; //타이어의 수명
	public int accumulatedRotation; //누적 회전수
	public String location; //타이어의 위치
	
	//생성자
	public Tire(String  location, int maxRotation) {
		this.location=location;
		this.maxRotation=maxRotation;
	}
	
	//메소드
	public boolean roll() {
		++accumulatedRotation; //누적 회전수 1증가
		if(accumulatedRotation<maxRotation) { //누적 회전수가 최대 회전수보다 낮을 때(정상 회전)
			System.out.println(location + " Tire 수명 : "+(maxRotation-accumulatedRotation)+"회");
			return true;
		} else { //(누적값이 최대를 넘어 설 때)
			System.out.println("*** "+location+" Tire 펑크 ***");
			return false;
		}
	}
}
