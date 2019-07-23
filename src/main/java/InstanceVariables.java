public class InstanceVariables {
    int i;
    String branch = "ECE";
    static int o=90;

    void userDetails(int id, String br) {
        i = id;
        branch = br;
    }

    public static void main(String[] args) {
        InstanceVariables in = new InstanceVariables();
        in.userDetails(10,"ece");
        System.out.println(in.i+"   "+in.branch+o);

    }
}
