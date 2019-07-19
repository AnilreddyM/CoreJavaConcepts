import java.util.Scanner;

public class NestedCaseStatements {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            String iCourseName = sc.nextLine();
            int iCoursecode = sc.nextInt();


            switch (iCoursecode) {
                case 1:
                    switch (iCourseName) {
                        case "java":
                            System.out.println("JAVA");
                            break;
                        case "Testing":

                            System.out.println("Testing");
                            break;
                        case "Python":

                            System.out.println("Python");
                            break;
                        case "Pega":

                            System.out.println("Pega");
                            break;
                        default:
                            System.out.println("Not matching with any course name");
                            break;
                    }
                    break;

                case 2:
                    switch (iCourseName) {
                        case "Embeded":
                            System.out.println("Embedded C");
                            break;
                        case "VLSI":
                            System.out.println("VLSI ");
                            break;
                        case "Clang":
                            switch (iCoursecode) {
                                case 2:
                                    System.out.println("Inside Case2");
                                    break;
                            }
                            System.out.println("C lang");
                            break;
                        default:
                            System.out.println("Not matching with any core prgm lang");
                            break;
                    }
                    break;
                default:
                    System.out.println("Not matching with any course code" + " " + iCoursecode);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
