package opps_practics.classobjectconstructorethisusse;


class Number {
    int value;

    Number(int value){
       this.value = value;

    }

    void swapNumber(Number n){
        int temp = n.value;
        n.value = value;
        value = temp;

    }

    void display(){
        System.out.println("Value: " + value);
    }

}
public class SwapNumber {
    public static void main(String[] args) {
        // Creating 2 objects
        Number n1 = new Number(10);
        Number n2 = new Number(20);

        System.out.println("Before Swap:");
        n1.display();
        n2.display();

        // Swapping using object method
        n1.swapNumber(n2);

        System.out.println("After Swap:");
        n1.display();
        n2.display();
    }
}
