import java.util.Scanner;
public class MyClass {
  public static void main(String args[]) {
  int age;
  System.out.println("enter a age");
  Scanner in=new Scanner(System.in);
  age=in.nextInt();
  if(age>=18){
      System.out.println("you are eligible for vote");
  }
  else{
      System.out.println("you are not eligible");
  }
  }
}
