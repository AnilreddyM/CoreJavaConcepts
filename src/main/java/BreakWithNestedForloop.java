public class BreakWithNestedForloop {
    public static void main(String[] args) {

        for (int i=1;i<=6;i++){
            for (int j=1;j<=4;j++){
                if (j==2){
                    break;

                }
                System.out.println(i+""+j);
            }
        }

    }
}
