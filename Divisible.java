import java.util.Scanner;
public class Divisible {
  public static void main(String args[]) {
  int number;
  System.out.println("enter a number");
  Scanner in=new Scanner (System.in);
  number= in.nextInt();
  if(number%3==0 && number%5==0){
      System.out.println("is a divisible number");
  }
  else{
      System.out.println("is not a divisible number");
  }
}
}