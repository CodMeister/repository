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
			System.out.println("1.����|2.���|3.�ܰ�|4.����");
			System.out.println("______________________");
			System.out.println("����>");
			
			
			
			
			int input = scanner.nextInt();
			
			switch(input) {
			case 1:
				System.out.println("���ݾ�>");
				int moneyin = scanner.nextInt();
				sum=sum+moneyin;
				continue;
			case 2:
				System.out.println("��ݾ�>");
				int moneyout = scanner.nextInt();
				sum-=moneyout;
				continue;
			case 3:
				System.out.println("�ܰ�>");
				System.out.println(sum);
				continue;
			case 4:
				System.out.println("����>");
				break;
			}
			
			
		}
		
		

	}

}
