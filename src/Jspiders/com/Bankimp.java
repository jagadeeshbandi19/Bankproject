package Jspiders.com;

public class Bankimp implements Bank {
	private int balance;

	public Bankimp(int balance) {
		this.balance = balance;
	}

	@Override
	public void diposit(int amount) {
		// TODO Auto-generated method stub
		System.out.println("deposite rs" + amount);
		balance += amount;
		System.out.println("amount deposite success");
	}

	@Override
	public void withdraw(int amount) {
		// TODO Auto-generated method stub
		if (amount <= balance) {
			System.out.println("withdraw rs" + amount);
			balance = balance - amount;
			System.out.println("amoutn withdraw sucess");
		} else {
			try {
				throw new insuffcientexeption("insuffient found");
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
		}
	}

	@Override
	public int getBalence() {
		// TODO Auto-generated method stub

		return balance;
	}

	@Override
	public String displayerrormessage() {
		// TODO Auto-generated method stub
		return "invalied choice ,kindly enter correcct choice";
	}

}
