public class WhilewithContinue {
    public static void main(String[] args) {

        int i = 1;
        while (i <= 5) {
            if (i == 3) {
                continue;
            }
            i++;
            System.out.println(i);


        }
    }
}
