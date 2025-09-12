import java.util.Scanner;
public class Leapyear {
  public static void main(String args[]) {
    int year;
    System.out.println("enter a year");
    Scanner in=new Scanner(System.in);
    year=in.nextInt();
    if(year%4==0){
        System.out.println(year+"year is a leap year");
    }
    else{
        System.out.println(year+ "year is not a leap year" );
    }
  }
}