package lectures_05;

public class Demo {
   public static void main(String[] args){
        
        //Operators in java

        // Arithmetic operators

        int a = 5;
        int b = 10;

        int c = a+b; // 15
        int d = a-b; // -5
        int e = a*b; // 50
        int f = a/b; // 0
        int g = a%b; // 5

        System.out.println("simple Arihmetic operators"+" "+c+" "+d+" "+e+" "+f+" "+g);


        // Arithmetic compound operators
        int h = a + 2;
        // h = h+2; //since this is ok in CSE

        h += 2; // h = h + 2; h = 9

        h -= 2; // h = h - 2; h = 7

        h *= 2; // h = h * 2; h = 14

        h /= 2; // h = h / 2; h = 7

        h %= 2; // h = h % 2; h = 1

        System.out.println("compound Arihmetic operators"+" "+h);

         int i = 5;
         i++; // i = i + 1; i = 6
         i--; // i = i - 1; i = 5

         System.out.println(i);

         // pre increment and post increment.

         int j =  7;
         j++; // post increment
         ++j; // pre increment

         System.out.println(j);
         // j = 9

         int k = j++ ; // k = j ; j = j + 1; k = 9; j = 10
         System.out.println(k);
         System.out.println(j);

         int l = ++j; // l = j + 1; j = j + 1; l = 11; j = 12
         System.out.println(l);
         System.out.println(j);

         // Relational operators

         int m = 5;
         int n = 10;

         System.out.println(m > n); // false
         System.out.println(m < n); // true
         System.out.println(m >= n); // false
         System.out.println(m <= n); // true
         System.out.println(m == n); // false
         System.out.println(m != n); // true


         // bitwise operators

         int o = 5;
         int p = 10;

         System.out.println(o & p); // 0
         System.out.println(o | p); // 15
         System.out.println(o ^ p); // 15
         System.out.println(~o); // -6
         System.out.println(o << 2); // 20
         System.out.println(o >> 2); // 1
         System.out.println(o >>> 2); // 1

         // logical operators

         System.out.println(true && true); // true
         System.out.println(true && false); // false
         System.out.println(true || true); // true
         System.out.println(true || false); // true
         System.out.println(!true); // false

         // operators precedence

         int q = 5;
         int r = 10;

         int s = q + r * 2; // 25
         int t = (q + r) * 2; // 30

         System.out.println(s);
         System.out.println(t);

         




   }
}  
