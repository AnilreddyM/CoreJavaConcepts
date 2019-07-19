import java.util.InputMismatchException;
import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {

      try {
          Scanner sc = new Scanner(System.in);
          short a = sc.nextShort();
          if (a > 18) {
              System.out.println("age is gretaer then 18 years");
          }
          if (a < 15) {
              System.out.println("age is lessthen 15 years");
          } else {
              System.out.println("Input is wrong");
          }
      }
      catch (Exception e){
          System.out.println("Input mismatcqh exception");

      }

        }
}
