public class ContinueStmt {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++) {
                if (i == 4 | i == 6) {
                    continue;
                } System.out.println(i+""+j);
            }

        }
    }
}
