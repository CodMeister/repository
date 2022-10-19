package chapter06exercise;

public class Account2 {
	
	//필드
	private String ano;
	private String owner;
	private int balance;
	//생성자
	public Account2(String ano, String owner, int balance) {
		this.ano=ano;
		this.owner=owner;
		this.balance= balance;
	}
	//메소드 Getter, Setter
	public String getAno() {return ano;}
	public void setAno(String ano) {this.ano=ano;}
	public String getOwner() {return owner;}
	public void setOwner(String owner) {this.owner=owner;}
	public int getBalance() {return balance;}
	public void setBalance(int balance) {this.balance=balance;}
	
}
