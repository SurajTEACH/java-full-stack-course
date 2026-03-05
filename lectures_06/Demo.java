package lectures_06;

public class Demo {
    public static void main(String[] args){
        System.out.println("Hello, World!");

        // selection statement

        int a = 5;
        int b = 10;

        if(a > b){
            System.out.println("a is greater than b");
        }
        else if(a < b){
            System.out.println("a is less than b");
        }
        else{
            System.out.println("a is equal to b");
        }

        // iteration statement

        for(int i = 0; i < 10; i++){
            System.out.println("Hello, World!");
        }

        // jump statement
       // return, break, continue
      
       for(int i = 0; i < 10; i++){
        if(i == 5){
            break;
        }
        System.out.println("Hello, World!");
       }

        for(int i = 0; i < 10; i++){
            if(i == 5){
                continue;
            }
            System.out.println("Hello, World!");
           }

        for(int i = 0; i < 10; i++){
            if(i == 5){
                return;
            }
            System.out.println("Hello, World!");
           }

        System.exit(0);

    }
}
