package chapter06exercise;

import java.util.Scanner;

public class BankApplication {
	private static Account2[] accountArray = new Account2[100];
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
		accountArray.getano();
	}
	
	//���¸�Ϻ���
	private static void accountList() {
		
	}
	
	//�����ϱ�
	private static void deposit() {
		
	}
	
	//����ϱ�
	private static void withdraw() {
		
	}
	
	//Account2 �迭���� ano�� ������ Account ��ü ã��
	private Static Account2 findAccount(String ano) {
		
	}

}
