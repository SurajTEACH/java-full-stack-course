package lectures_03;

public class DataType {
   public static void main(String[] args) {
        // Primitive data types
        // Integer types => byte, short, int, long
        byte b = 5;
        short s = 10;
        int i = 4000;
        long l = 10000;

        System.out.println("Integer types:...................");

        System.out.println("Byte value: " + b + ", Short value: " + s + ", Int value: " + i + ", Long value: " + l);

        System.out.println("Real number types:...................");

        // Real number types => float, double
        float f = 10.54f;
        double d = 23.0987;
        

        System.out.println("Float value: " + f + ", Double value: " + d);
        
        System.out.println("Character type:..............");
        // Character type => char
        char c = 'A';
        System.out.println("Char value: " + c);

        System.out.println("Boolean type:.......................");
        // Boolean type => boolean
        boolean bool = true;
        System.out.println("Boolean value: " + bool);
        boolean bool2 = false;
        System.out.println("Boolean value: " + bool2);

        System.out.println("String type:......................");
        // String type => String
        String str = "Hello World";
        System.out.println("String value: " + str);


   }
}
