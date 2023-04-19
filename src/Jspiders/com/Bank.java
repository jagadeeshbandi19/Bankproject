package Jspiders.com;

public interface Bank {
	
	void diposit(int amount);

	void withdraw(int amount);

	int getBalence();

	String displayerrormessage();
}
