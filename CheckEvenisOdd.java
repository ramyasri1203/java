import java.util.Scanner;
public class CheckEvensisOdd {
  public static void main(String args[]) {
  int num;
  System.out.println("enter a number");
  Scanner in=new Scanner (System.in);
  num = in.nextInt();
  if(num%2==0){
      System.out.println("even");
  }
   else{
      System.out.println("odd");
  }
    if(num%5==0){
          System.out.println(" divisble");
      }
      else{
          System.out.println("Not divisible");
      }
  
  }
}
