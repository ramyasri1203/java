import java.util.Scanner;
public class MyClass {
  public static void main(String args[]) {
   int age;
   System.out.println("enter your age");
   Scanner in=new Scanner (System.in);
   age= in.nextInt();
   if(age>=18){
       System.out.println("You are eligible to vote");
   if(age>=60){
       System.out.println("You are a senior citizen");
   }
  else{
       System.out.println("You are not eligible to citizen");
   }
   }
     else{
       System.out.println("you are not eligible to vote");
   }
   
  }
}
