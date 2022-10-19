package Exercise4;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;
		Scanner scanner= new Scanner(System.in);
		int sum=0;
		while(run) {
			System.out.println("______________________");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("______________________");
			System.out.println("선택>");
			
			
			
			
			int input = scanner.nextInt();
			
			switch(input) {
			case 1:
				System.out.println("예금액>");
				int moneyin = scanner.nextInt();
				sum=sum+moneyin;
				continue;
			case 2:
				System.out.println("출금액>");
				int moneyout = scanner.nextInt();
				sum-=moneyout;
				continue;
			case 3:
				System.out.println("잔고>");
				System.out.println(sum);
				continue;
			case 4:
				System.out.println("종료>");
				break;
			}
			
			
		}
		
		

	}

}
