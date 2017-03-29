import java.util.*;

public class SavingsAccount extends Account{
		int withdrawLimit=0;

	SavingsAccount(String accountNo,int balance){
		super(accountNo,balance);
		this.withdrawLimit = withdrawLimit;
	}
	//Overloaded withdrawMoney to check for withdraw Limit
	public void withdrawMoney(){
		System.out.print("Enter money : ");
		Scanner in = new Scanner(System.in);
		int money = in.nextInt();
		if(money>balance){
			System.out.println("Insufficient Balance");
		}
		else if(money%500!=0){
				System.out.println("Enter in multiples of 500");
				withdrawMoney();
			}
		else
		{
			if(withdrawLimit > 2){
				balance-=20;}



			balance-=money;
			System.out.println("Please take your cash.");
			System.out.println("Available Balance : " + balance);
			withdrawLimit++;}
		
	}}
