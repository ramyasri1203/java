import java.util.Scanner;
public class MyClass {
  public static void main(String args[]) {
  int a;
  int b;
  int c;
  Scanner in=new Scanner(System.in);
  System.out.println("enter a numbers:");
  a=in.nextInt();
  b=in.nextInt();
  c=in.nextInt();
  if(a>=b && a>=c){
      System.out.println(a+"is the largest number");
  }
  else if(b>=a && b>=c){
      System.out.println(b+"is the largest number");
  }
  else {
      System.out.println(c+ "is the largest number");
  }

    in.close();
  }
}
