import java.util.Scanner;

public class EnumConstant {
    public enum Day {Sun, Mon, Tue, Wed, Thu, Fri, Sat}

    public static void main(String[] args) {



        Day[] DayNow = Day.values();
        for (Day Now : DayNow) {
            switch (Now){
                case Sun:
                    System.out.println("Sunday ");
                    break;
                case Mon:
                    System.out.println("MOnday");
            break;
                case Tue:
                    System.out.println("Tuesday");
            break;
            default:
                System.out.println("Default case ");
            }



        }
    }
}
