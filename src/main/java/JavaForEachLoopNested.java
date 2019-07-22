public class JavaForEachLoopNested {
    public static void main(String[] args) {
        int a[][][]={{{10,20,30},{40,50,60}},{{70,80,90},{11,22,33}}};

        for (int b[][]:a){
            for (int c[]:b){
                for (int d:c){
                    System.out.println(d);

                }
            }
        }

    }
}
