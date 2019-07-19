import java.util.Scanner;

public class SwitchMonth {
    public static String name = "";

    public static void main(String[] args) {
        try{
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        switch (month) {

            case 1:
                name = "jan";
                break;
            case 2:
                name = "feb";
                break;
            case 3:
                name = "mar";
                break;
            default:
                name = "None of the above";


        }
        System.out.println("Result Month"+name);

    }catch(Exception e){
            throw new CustomException("Number format exception");
    }

}}
