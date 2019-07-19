public class BitwiseOperators {

    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=29;
        System.out.println(a<b&&c++>a);
        System.out.println(a>b&c>a);
        if(a>b&&c>a){
            System.out.println("First Condition");

        }else if (a>b&c>a){
            System.out.println("Second Condition");
        }else {
            System.out.println("Third Condition");
        }
    }
}
