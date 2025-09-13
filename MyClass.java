import java.util.Scanner;
public class MyClass {
  public static void main(String args[]) {
  int a;
  int b;
  Scanner in=new Scanner(System.in);
  System.out.println("enter a numbers:");
  a=in.nextInt();
  b=in.nextInt();
  if(a>b){
      System.out.println(a+"is the largest number");
  }
  else if(a<b){
      System.out.println(b+"is the largest number");
  }
  else{
      System.out.println("both numbers or equal");
  }
}
}