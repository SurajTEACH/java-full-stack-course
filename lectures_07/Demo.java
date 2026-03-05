package lectures_07;
public class Demo {

    public static void main(String[] args) {

        // ==============================
        // 1. FOR LOOP (Fixed Iteration)
        // ==============================
        System.out.println("FOR LOOP (1 to 5):");
        for(int i = 1; i <= 5; i++){
            System.out.println("Number: " + i);
        }


        // ==============================
        // 2. WHILE LOOP (Condition Based)
        // ==============================
        System.out.println("\nWHILE LOOP (1 to 5):");
        int i = 1;
        while(i <= 5){
            System.out.println("Number: " + i);
            i++;
        }


        // ==============================
        // 3. DO-WHILE LOOP (At least once)
        // ==============================
        System.out.println("\nDO-WHILE LOOP (1 to 5):");
        int j = 1;
        do{
            System.out.println("Number: " + j);
            j++;
        }while(j <= 5);


        // ==============================
        // 4. FOR-EACH LOOP (Array Traversal)
        // ==============================
        System.out.println("\nFOR-EACH LOOP (Array):");
        int[] arr = {10, 20, 30, 40};

        for(int num : arr){
            System.out.println("Value: " + num);
        }


        // ==============================
        // 5. BREAK STATEMENT
        // ==============================
        System.out.println("\nBREAK EXAMPLE:");

        for(int k = 1; k <= 5; k++){
            if(k == 3){
                System.out.println("Stopping at 3");
                break; // loop stop
            }
            System.out.println(k);
        }


        // ==============================
        // 6. CONTINUE STATEMENT
        // ==============================
        System.out.println("\nCONTINUE EXAMPLE:");

        for(int k = 1; k <= 5; k++){
            if(k == 3){
                continue; // skip 3
            }
            System.out.println(k);
        }


        // ==============================
        // 7. REAL-WORLD EXAMPLE
        // ==============================
        System.out.println("\nREAL-WORLD EXAMPLE:");

        int[] marks = {45, 60, 30, 90, 100};

        for(int mark : marks){

            // fail student skip
            if(mark < 40){
                continue;
            }

            // topper mil gaya to stop
            if(mark == 100){
                System.out.println("Topper found!");
                break;
            }

            System.out.println("Passed student marks: " + mark);
        }


        // ==============================
        // 8. INFINITE LOOP (with break)
        // ==============================
        System.out.println("\nINFINITE LOOP CONTROLLED:");

        int count = 1;
        while(true){
            System.out.println("Count: " + count);

            if(count == 3){
                break; // warna infinite ho jata
            }

            count++;
        }


        System.out.println("\nProgram Ended Successfully!");
    }
}