import java.io.*;
import java.util.*;

public class Account implements Functions{
  int balance;
  String accountNo;
  Account(String accountNo,int balance){
    this.accountNo = accountNo;
    this.balance = balance;
  }
  public void depositMoney(){
    System.out.print("Enter money : ");
    Scanner in = new Scanner(System.in);
    int temp = in.nextInt();
    balance += temp;
  }
  public int checkBalance(){
    return balance;	}

    public void withdrawMoney(){}


    }
