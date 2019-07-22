public class LabelledForEachLoop {
    public static void main(String[] args) {
        step1:
        for (int i=1;i<=5;i++){
            step2:
            for (int j=1;j<=5;j++){
                System.out.println(i+""+j);
                if(i==2|j==1){
                    break step2;
                }

            }
        }

    }
}
