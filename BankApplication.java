package chapter06exercise;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("_________________________________________");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("_________________________________________");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo ==1) {
				createAccount();
			} else if(selectNo==2) {
				accountList();
			} else if(selectNo==3) {
				deposit();
			} else if(selectNo==4) {
				withdraw();
			} else if(selectNo==5) {
				run= false;
			} 
			
		}
		System.out.println("프로그램 종료");
		

	}
	
	//계좌생성하기
	private static void createAccount() {
		System.out.println("_________");
		System.out.println("계좌생성");
		System.out.println("_________");
		System.out.print("계좌번호 : ");
		String ano=scanner.next();
		System.out.print("계좌주 : ");
		String owner=scanner.next();
		System.out.print("초기입금액 : ");
		int balance=scanner.nextInt();
		Account account = new Account(ano, owner, balance);
		for(int i=0; i<100;i++) {
			if(accountArray[i]==null) {
				accountArray[i]=account;
				System.out.println("결과 : 계좌가 생성되었습니다.");
				break;
			}
		}
	}
	
	//계좌목록보기
	private static void accountList() {
		System.out.println("_________");
		System.out.println("계좌목록");
		System.out.println("_________");
		for(int i=0;i<100;i++) {
			if(accountArray[i]!=null) {
				System.out.println(accountArray[i].getAno()+"\t"+accountArray[i].getOwner()+"\t"+accountArray[i].getBalance());
			} else {
				break;
			}
		}
	}
	
	//예금하기
	private static void deposit() {
		System.out.println("_________");
		System.out.println("예금");
		System.out.println("_________");
		System.out.print("계좌번호 : ");
		String ano=scanner.next();
		Account account = findAccount(ano);
		if(account==null) {
			System.out.println("계좌가 존재하지 않습니다.");
			return;
		}
		System.out.print("예금액 : ");
		int balance=scanner.nextInt()+account.getBalance();
		account.setBalance(balance); //this.balance=balance;
		System.out.println("결과 : 예금이 성공되었습니다.");
		
	}
	
	//출금하기
	private static void withdraw() {
		System.out.println("_________");
		System.out.println("출금");
		System.out.println("_________");
		System.out.print("계좌번호 : ");
		String ano=scanner.next();
		Account account=findAccount(ano);
		if(account==null) {
			System.out.println("계좌가 존재하지 않습니다.");
			return;
		}
		
		System.out.print("출금액 : ");
		int balance=account.getBalance()-scanner.nextInt();
		if(balance<=0) {
			System.out.println("잔고액보다 많은 금액을 출금할 수 없습니다.");
			return;
		}
		account.setBalance(balance);
		System.out.println("결과 : 출금이 성공되었습니다.");
	}
		
	
	
	//Account2 배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) { //type : Account -> return type = account
		Account account=null;
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i]!=null){
				if(accountArray[i].getAno().equals(ano)) {
					account=accountArray[i];
					break;
				}
			}
		}
		return account;
	}
}