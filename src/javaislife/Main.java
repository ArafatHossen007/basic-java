package javaislife;

public class Main {

    public static void main(String[] args) {
     information obj= new information();
        obj.family("araft",24,"male");
        obj.family("yusuf",32,"male");
        obj.family("Mostafa",60,"female");
        obj.family("jannnatul",27,"female");
    }
}
 class information{
     static void family(String name,int age,String gender){
         System.out.println("  name:"+name);
         System.out.println("   age:"+age);        // this method will execute for each of the family member
         System.out.println("gender:"+gender);   // that are called in main method.
         System.out.println("================");

     }
 }