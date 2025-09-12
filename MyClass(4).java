import java.util.Scanner;
public class MyClass {
  public static void main(String args[]) {
  int n;
  System.out.println("enter a number");
  Scanner in=new Scanner(System.in);
  n =in.nextInt();
  if(n>0){
      System.out.println(n+"Positive number");
  }
  else if(n<0){
      System.out.println(n+"Negative number");
  }
  else{
      System.out.println("zero");
  }
  }
}