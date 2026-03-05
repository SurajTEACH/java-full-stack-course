public class ArrayOperations {

    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50};
        int size = arr.length;

        System.out.println("Original Array:");

        for(int i = 0; i < size; i++){
            System.out.println(arr[i]);
        }

        // Update Operation
        arr[2] = 100;

        System.out.println("Array After Update:");

        for(int i = 0; i < size; i++){
            System.out.println(arr[i]);
        }

        // Searching Operation
        int key = 40;
        boolean found = false;

        for(int i = 0; i < size; i++){
            if(arr[i] == key){
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }

        if(found == false){
            System.out.println("Element not found");
        }

        // Insertion Operation
        int newElement = 25;
        int position = 2;

        int newArr[] = new int[size + 1];

        for(int i = 0; i < position; i++){
            newArr[i] = arr[i];
        }

        newArr[position] = newElement;

        for(int i = position; i < size; i++){
            newArr[i + 1] = arr[i];
        }

        System.out.println("Array After Insertion:");

        for(int i = 0; i < newArr.length; i++){
            System.out.println(newArr[i]);
        }

        // Deletion Operation
        int deleteIndex = 3;

        int delArr[] = new int[newArr.length - 1];

        int j = 0;

        for(int i = 0; i < newArr.length; i++){

            if(i == deleteIndex){
                continue;
            }

            delArr[j] = newArr[i];
            j++;
        }

        System.out.println("Array After Deletion:");

        for(int i = 0; i < delArr.length; i++){
            System.out.println(delArr[i]);
        }

    }
}