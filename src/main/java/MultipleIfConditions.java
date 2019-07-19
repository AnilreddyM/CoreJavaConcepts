import java.util.Scanner;

public class MultipleIfConditions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        int weight=sc.nextInt();
        if(age>18){
            if(weight>=45){
                System.out.println("Eligible to donate blood");
            }

        }else
        {
            System.out.println("age is not Eligible to donate blood");
        }

    }
}
