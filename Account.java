package chapter06exercise;

public class Account {
	//�ʵ�(field)
	private int balance;
	//���(Constant) ����
	final int MIN_BALANCE = 0;
	final int MAX_BALANCE=1000000;
	
	//Getter
	public int getBalance() {
		
		return this.balance;
	}
	
	//Setter
	public void setBalance(int balance) {
		if(MIN_BALANCE<=balance&&balance<=MAX_BALANCE) {
			this.balance=balance;
		} else {
			return;
		}
		
	}
}
