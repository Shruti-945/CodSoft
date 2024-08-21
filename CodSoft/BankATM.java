import java.util.Scanner;
class BankAccount {
  private int balance;

  public BankAccount(int initialAmount) {
    this.balance=initialAmount;
  }

  public int balance() {
    return balance;
  }

  public void deposit(int amount) {
    if(amount>0) {
      balance+=amount;
      System.out.println("Deposit of "+ amount + "Rs was successful");
    } else {
      System.out.print("Invalid entry!. Please choose a number above 0");
    }
  }
  public void withdraw(int amount) {
    if(amount>0 && amount<= balance) {
      System.out.println("Withdraw of " + amount+ " Rs successful");
      amount-=balance;

    } else {
      System.out.print("Invalid entry!Insufficient Balance or invalid value entered");

    }
  }
}


 class ATM {
  private BankAccount account;   //this creates a variable that can only be used by the class ATM
  public ATM(BankAccount account) {
    this.account=account;
  }
  public void display() {
    System.out.println("Select your choice");
    System.out.println("1. Check Balance");
    System.out.println("2. Deposit");
    System.out.println("3. Withdraw");
    System.out.println("4. Leave");
  }
  public void run() {
    Scanner obj=new Scanner(System.in);
    int choice;
    do {
      display();
      System.out.println("Pick your choice");
      choice=obj.nextInt();

      switch (choice) {
        case 1:
        System.out.println("Current Balance " + account.balance());
          
          break;
        case 2:
        System.out.println("Enter amount to deposit");
        int depositAmt=obj.nextInt();
        account.deposit(depositAmt);
        break;
        case 3:
        System.out.println("Enter amount to withdraw");
        int withdrawAmt=obj.nextInt();
        account.withdraw(withdrawAmt);
        break;
        case 4:
        System.out.println("Thanks for working with our Bank");

        break;
        default:
        System.out.println("Invalid choice");
      }
    }while(choice!=4);
      obj.close();

    
  }

}

  

public class BankATM {
  public static void main(String[] args) {
  BankAccount userAccount=new BankAccount(30000);
  ATM atm=new ATM(userAccount);
  atm.run();    
  }

  
}
