import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      Scanner sc=new Scanner(System.in);
      System.out.println("Please Enter Your Name, password and initial balance");
      String name=sc.next();
      String password=sc.next();
      int balance=sc.nextInt();

      SBIaccount Harshalacc = new SBIaccount(name, balance, password);

        System.out.println("Your Account has been created with Account number"+Harshalacc.getAccountNo());

        System.out.println("Your current balance is"+Harshalacc.getbalance());

        System.out.println(Harshalacc.depositemoney(500));

        System.out.println("New balance is"+Harshalacc.getbalance());

        System.out.println("Enter the amount to be withdrawn");

        int amount=sc.nextInt();

      System.out.println("Enter your password");

      String enterpass=sc.next();

      System.out.println(Harshalacc.withdrawmoney(amount,enterpass));

      System.out.println("Interest for 4 years on current balance"+Harshalacc.getbalance()+"is"+Harshalacc.calculateinterest(4));

    }
}