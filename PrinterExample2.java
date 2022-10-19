package chapter06exercise;

public class PrinterExample {

	public static void main(String[] args) {
		//이전 문제와 바뀐 점 : 객체 생성 x, printer → Printer 생성자 이름에서 객체 이름으로 바뀜.
		Printer.println(10);
		Printer.println(true);
		Printer.println(5.7);
		Printer.println("홍길동");
	}

}
