public class CopyObjectsWithoutConstructor {
String ename;
int eid;


    CopyObjectsWithoutConstructor(){

    }

    CopyObjectsWithoutConstructor(String name,int id){
        ename=name;
        eid=id;
    }
    void display(){
        System.out.println(ename+""+eid);
    }




    public static void main(String[] args) {

        CopyObjectsWithoutConstructor c=new CopyObjectsWithoutConstructor("mail",452);
        CopyObjectsWithoutConstructor c1=new CopyObjectsWithoutConstructor();

        c1.ename=c.ename;
        c1.eid=c.eid;

        c.display();
        c1.display();

    }
}
