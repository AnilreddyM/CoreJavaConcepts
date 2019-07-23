
abstract class Bike1{
    abstract void run();
    abstract void mrftyres();
    void milage(){
        System.out.println("20 km per hour");
    }
}

class Android extends Bike1{
    @Override
    void mrftyres() {
        System.out.println("MyTyres");
    }


    @Override
    void milage() {
        System.out.println("MyMilage");
    }

    @Override
    void run() {
        System.out.println("MyRun");
    }
}

class Honda5 extends Bike1{

    void run(){System.out.println("running safely");}

    @Override
    void mrftyres() {
        {
            System.out.println("TestEngine");
        }
    }


    public static void main(String args[]) {
        try {
            Bike1 obj=new Android();

            obj.milage();
            obj.mrftyres();
            obj.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }}