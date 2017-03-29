import java.util.*;

public class Driver{
  public static void main(String args[]){
    SavingsAccount s1 = new SavingsAccount("xxxx",5000);
    CheckingAccount c1 = new CheckingAccount("xxxx",100000);
    Functions fun=null;
    Scanner in = new Scanner(System.in);

    int ch =0;
    while(true){
      ch = 0;
      System.out.print("1.SAVINGS\n2.CHECKING\nENTER YOUR CHOICE : ");
      int chk = in.nextInt();
      if(chk==1){   //Uses an object of the interface to set the reference
        fun = s1;}
        if(chk==2){
          fun = c1;}

          while(ch !=4){

            System.out.println("1.Check Balance\n2.Deposit Money\n3.Withdraw Money\n4.Exit");
            System.out.print("Enter your choice : ");
            ch = in.nextInt();
            switch(ch){
              case 1:System.out.println("Your balance is " + fun.checkBalance());break;
              case 2:fun.depositMoney();break;
              case 3:fun.withdrawMoney();break;
              case 4:break;

              default : System.out.println("Invalid Choice!");
            }}
          }}}
