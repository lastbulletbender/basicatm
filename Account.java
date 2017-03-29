import java.io.*;
import java.util.*;

public class Account implements Functions{
  int balance;
  String accountNo;
  Account(String accountNo){
    this.accountNo = accountNo;
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
