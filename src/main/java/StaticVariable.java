public class StaticVariable {
    int a=10;
    static int b=10;
    void method1(){
        System.out.println("Test");
    }
    public static void main(String[] args) {
        System.out.println("Hai");
        StaticVariable d=new StaticVariable();
        d.method1();
    }
}
