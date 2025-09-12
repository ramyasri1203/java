import java.util.Scanner;
public class Multiple7{
  public static void main(String args[]) {
  int n;
  System.out.println("enter a number");
  Scanner in=new Scanner(System.in);
  n=in.nextInt();
  if(n%7==0){
      System.out.println(n+"is a multiple of 7");
  }
  else{
      System.out.println(n+"is not a multiple of 7");
  }
}
}
