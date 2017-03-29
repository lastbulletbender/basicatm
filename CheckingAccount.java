
import java.util.*;

public class CheckingAccount extends Account{

  int minimumBalance = 50000;

  //Constructor
  CheckingAccount(String accountNo,int balance){
    super(accountNo);
    this.balance = balance;
  }
  //Overloaded Function checking for minimum Balance
  public void withdrawMoney(){
    System.out.print("Enter money : ");
    Scanner in = new Scanner(System.in);
    int money = in.nextInt();
    if(money>balance){
      System.out.println("Insufficient Balance");
    }
    else
    {
      balance-=money;
      if(balance<minimumBalance){
        balance-=200;
        System.out.println("YOU HAVE EXCEEDED YOUR MINIMUM BALANCE!");
        System.out.println("200 WILL BE DEDUCTED EVERY DAY");
        System.out.println();
        System.out.println();
      }
      System.out.println("Please take your cash.");
      System.out.println("Available Balance : " + balance);
    }
  }}
