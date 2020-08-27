package javaislife;

 public class methodoverloading {
     static void plusMethod(int x, int y) {
         System.out.println(x + y);
         //return 0;
     }

     static double plusMethod(double x, double y) {
         if(x>10){
             System.out.println(true);
         }
         else {
             System.out.println(false);
         }
         System.out.println(x + y);
         return 0;
     }

     public static int add(int a, int b) {

         return a + b;
//     System.out.println(a + b);
         // return 0;
     }

     public static void main(String[] args) {
         plusMethod(8, 5);
         plusMethod(4.3, 6.26);
         plusMethod(5, 6);
         plusMethod(6, 8);
         plusMethod(8, 9);
         plusMethod(5.5, 95.5);
         System.out.println("**************");
         int sum = add(4, 4);
        // int add1 = add(5, 7);
         System.out.println(sum);
     }


 }


