public class DowhilewithContinue {
    public static void main(String[] args) {
        int i=1;
        do{

            if(i==4|i==5|i==8){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }while (i<=9);
    }
}
