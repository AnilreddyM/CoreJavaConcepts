import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {

        sample s = new sample();
        try {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int result = (a % 2 == 0) ? 3434 : 34343443;
            System.out.println(result);

            Integer c = 5;

            if( s instanceof sample) {
                System.out.println("yes");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }}
