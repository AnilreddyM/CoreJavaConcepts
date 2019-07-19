import java.util.Scanner;

public class SwitchString {
    public static int brandno;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String brand=sc.nextLine();
   switch (brand){
       case "det":
           System.out.println(brandno=10);
           break;
       case "surf":
           System.out.println(brandno=11);
       case "soap":
           System.out.println(brandno=12);
       default:
               System.out.println( brandno=50);
   }
        System.out.println("Brand name ="+brandno);

    }
}
