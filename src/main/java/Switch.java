import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();

        switch (age){
            case 1:
                System.out.println("First case");
                break;
            case 2:
                System.out.println("Second case");
                break;
            default:
                System.out.println("Default case");



        }



    }
}
