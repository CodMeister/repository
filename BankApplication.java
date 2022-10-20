package chapter06exercise;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("_________________________________________");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("_________________________________________");
			System.out.print("����> ");
			
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
		System.out.println("���α׷� ����");
		

	}
	
	//���»����ϱ�
	private static void createAccount() {
		System.out.println("_________");
		System.out.println("���»���");
		System.out.println("_________");
		System.out.print("���¹�ȣ : ");
		String ano=scanner.next();
		System.out.print("������ : ");
		String owner=scanner.next();
		System.out.print("�ʱ��Աݾ� : ");
		int balance=scanner.nextInt();
		Account account = new Account(ano, owner, balance);
		for(int i=0; i<100;i++) {
			if(accountArray[i]==null) {
				accountArray[i]=account;
				System.out.println("��� : ���°� �����Ǿ����ϴ�.");
				break;
			}
		}
	}
	
	//���¸�Ϻ���
	private static void accountList() {
		System.out.println("_________");
		System.out.println("���¸��");
		System.out.println("_________");
		for(int i=0;i<100;i++) {
			if(accountArray[i]!=null) {
				System.out.println(accountArray[i].getAno()+"\t"+accountArray[i].getOwner()+"\t"+accountArray[i].getBalance());
			} else {
				break;
			}
		}
	}
	
	//�����ϱ�
	private static void deposit() {
		System.out.println("_________");
		System.out.println("����");
		System.out.println("_________");
		System.out.print("���¹�ȣ : ");
		String ano=scanner.next();
		Account account = findAccount(ano);
		if(account==null) {
			System.out.println("���°� �������� �ʽ��ϴ�.");
			return;
		}
		System.out.print("���ݾ� : ");
		int balance=scanner.nextInt()+account.getBalance();
		account.setBalance(balance); //this.balance=balance;
		System.out.println("��� : ������ �����Ǿ����ϴ�.");
		
	}
	
	//����ϱ�
	private static void withdraw() {
		System.out.println("_________");
		System.out.println("���");
		System.out.println("_________");
		System.out.print("���¹�ȣ : ");
		String ano=scanner.next();
		Account account=findAccount(ano);
		if(account==null) {
			System.out.println("���°� �������� �ʽ��ϴ�.");
			return;
		}
		
		System.out.print("��ݾ� : ");
		int balance=account.getBalance()-scanner.nextInt();
		if(balance<=0) {
			System.out.println("�ܰ�׺��� ���� �ݾ��� ����� �� �����ϴ�.");
			return;
		}
		account.setBalance(balance);
		System.out.println("��� : ����� �����Ǿ����ϴ�.");
	}
		
	
	
	//Account2 �迭���� ano�� ������ Account ��ü ã��
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