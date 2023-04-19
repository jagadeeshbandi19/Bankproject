package Jspiders.com;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bank b = new Bankimp(5000);
		while(true){
		System.out.println("1:disposit amount\n2:withdraw amount ");
		System.out.println("3:check balance\n4:exit");
		System.out.println("enter a choice");
		int choice = sc.nextInt();


			switch (choice) {
			case 1:
				System.out.println("enter to be deposite");
				int amountTodeposit = sc.nextInt();
				b.diposit(amountTodeposit);
				break;

			case 2:
				System.out.println("enter to be withdraw");
				int amountTowithdraw = sc.nextInt();
				b.withdraw(amountTowithdraw);
				break;

			case 3:
				System.out.println("avilabe balane rs:"+b.getBalence());
				break;

			case 4:
				System.out.println("thank you");
				System.exit(0);
				break;
			default:
				System.out.println(b.displayerrormessage());
			}
		}
	}
	}

