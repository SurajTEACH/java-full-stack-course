package projects.menudrivensystem;

import java.util.Scanner;

public class FoodStallMenuDrivenSystem {
    
    public static void main(String[] args){

      Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to Food Stall B.TECH WALLAH");

        String foodItems[];
        int prices[];

          foodItems = new String[]{
              "Sandwich",
              "Burger",
              "Pizza",
              "Pasta",
              "Noodles",
              "Chowmein",
              "Samosa",
              "Dosa",
              "Idli",
              "Vada"
          };

          prices = new int[]{
              40,   // Sandwich
              80,   // Burger
              150,  // Pizza
              120,  // Pasta
              90,   // Noodles
              70,   // Chowmein
              15,   // Samosa
              60,   // Dosa
              40,   // Idli
              35    // Vada
          };

          System.out.println("Show Menu");

          System.out.println(" * YES \n * NO");
          String showMenu =  sc.nextLine();

          if(showMenu.equals("YES")){
              showMenu(foodItems, prices);
          }
          else{
             System.out.println("Thank You for Visiting Us");
          }

        
        int totalBill = 0;

        int items = getChoiceItem();

        for(int i=0;i<items;i++){

            System.out.println("Enter Item Number");
            int choice = sc.nextInt();

            int quantity = getQuantity();

            int bill = calculateBill(prices, choice, quantity);

            totalBill = totalBill + bill;
        }

        displayBill(totalBill);
                



          
    }

     public static void showMenu(String foodItems[], int prices[]){

        System.out.println("\n----- MENU -----");

        for(int i=0;i<foodItems.length;i++){
            System.out.println((i+1) + ". " + foodItems[i] + " = Rs " + prices[i]);
        }
    }

    public static  int getChoiceItem(){

        Scanner sc = new Scanner(System.in);

        System.out.println("How many items you want to order?");
        int n = sc.nextInt();
        return n;
    }

    public static int getQuantity(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Quantity");
        int quantity = sc.nextInt();
        return quantity;
    }

    public static int  calculateBill(int prices[], int choice, int quantity){
                 
         int price = prices[choice-1];

        int total = price * quantity;

        return total;
    }

    public static void displayBill(int totalAmount){

        System.out.println("Total Amount = Rs " + totalAmount);
        System.out.println("Thank You for Visiting Us again visit B.TECH WALLAH");
    }
}
