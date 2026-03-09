package lectures_11;

class BankAccount {

    String name;
    int accountNumber;
    double balance;

    // 1️⃣ Default Constructor
    BankAccount() {

        System.out.println("Default Constructor Called");

        name = "Unknown";
        accountNumber = 0;
        balance = 0.0;

    }

    // 2️⃣ Parameterized Constructor
    BankAccount(String name, int accountNumber, double balance) {

        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;

        System.out.println("Parameterized Constructor Called");

    }

    // 3️⃣ Constructor Overloading
    BankAccount(String name, int accountNumber) {

        this(name, accountNumber, 0);   // Constructor Chaining

        System.out.println("2 Parameter Constructor Called");

    }

    // Method to display account details
    void displayAccount() {

        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);

        System.out.println("------------------------");

    }

    public static void main(String[] args) {

        // 1️⃣ Default Constructor
        BankAccount acc1 = new BankAccount();
        acc1.displayAccount();

        // 2️⃣ Parameterized Constructor
        BankAccount acc2 = new BankAccount("Suraj", 101, 5000);
        acc2.displayAccount();

        // 3️⃣ Constructor Overloading + Chaining
        BankAccount acc3 = new BankAccount("Rahul", 102);
        acc3.displayAccount();

    }
}