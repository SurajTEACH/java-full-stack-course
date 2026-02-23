package lectures_04;

public class demo {
    public static void main(String[] args) {
         
         // Implicit Type Conversion
         byte b = 24;
         int i = b;
         System.out.println(i); // 24 output

         // Explicit Type Conversion
         int j = 24;
         byte k = (byte) j;
         System.out.println(k); // 24 output

         // widening conversion
         byte l = 24;
         int m = l;
         System.out.println(m); // 24 output

         // narrowing conversion
         int n = 24;
         byte o = (byte) n;
         System.out.println(o); // 24 output

         int p = 300;
         byte q = (byte) p;
         System.out.println(q); // 44 output

         // automatic type conversion
         int r = 300;
         byte s = (byte) r;
         System.out.println(s); // 44 output

         int t = 25;
            
         byte u = (byte) (t * 7);
         System.out.println(u);

         int v = t * 7;
         byte w = (byte) v;
         System.out.println(w);

    }
}
