public class Constructor {
    String ename;
    int eid;

    Constructor(String name, int id) {
        ename = name;
        eid = id;
    }

    Constructor(Constructor s) {
        ename=s.ename;
        eid=s.eid;

    }
void display(){
    System.out.println(ename+""+eid);
}

    public static void main(String[] args) {
        Constructor s = new Constructor("Anil", 143);
        Constructor s1 = new Constructor(s);
        s.display();
        s1.display();
    }
}
