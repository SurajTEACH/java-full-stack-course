package lectures_09;

class function {

    // -------- BANK FUNCTIONS --------

    static void checkBalance() {
        int balance = 5000;
        System.out.println("Balance: " + balance);
    }

    static void withdrawMoney(int amount) {
        int balance = 5000;

        if(amount <= balance)
            System.out.println("Withdraw Successful: " + amount);
        else
            System.out.println("Insufficient Balance");
    }


    // -------- CALCULATOR FUNCTIONS --------

    static int add(int a, int b) {
        return a + b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }


    // -------- MAIN FUNCTION --------

    public static void main(String[] args) {

        // Bank Example
        checkBalance();
        withdrawMoney(2000);

        // Calculator Example
        int sum = add(10,20);
        int mul = multiply(5,4);

        System.out.println("Addition: " + sum);
        System.out.println("Multiplication: " + mul);
    }
}