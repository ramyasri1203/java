import java.util.Scanner;
public class StudentMark {
  public static void main(String args[]) {
  float mark;
  System.out.println("enter the mark");
  Scanner in= new Scanner(System.in);
  mark=in.nextFloat();
  if(mark>=90 && mark<=100){
      System.out.println("Grade A");
  }
  else if(mark>=80 && mark <=89){
      System.out.println("Grade B");
  }
  else if(mark>=70 && mark<=79){
      System.out.println("Grade C");
  }
  else if(mark>=60 && mark<=69){
      System.out.println("Grade D");
  }
  else{
      System.out.println("Fail");
  }
  }
}
