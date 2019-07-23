public class Constructor1 {
    int a = 0;

    Constructor1() {
        a++;
        System.out.println(a);

    }

    public static void main(String[] args) {
        Constructor1 c = new Constructor1();
        Constructor1 c1 = new Constructor1();
        Constructor1 c2 = new Constructor1();

    }
}
