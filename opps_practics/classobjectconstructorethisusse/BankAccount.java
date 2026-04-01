package opps_practics.classobjectconstructorethisusse;


class Bank {
   String accountHolder;
   int balance;
   Bank(String accountHolder, int balance){
      this.accountHolder = accountHolder;
      this.balance = balance;
   }
   void  displayBalance(){
      System.out.println(accountHolder+" "+"your account balance:"+balance);
   }
}
public class BankAccount {
    public static void main(String[] args) {
         Bank b1 = new Bank("suraj sahu", 35000);
         b1.displayBalance();

    }
}
