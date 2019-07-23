
class FinalkEY {
    int speedlimit = 90;//final variable

    void add() {
        System.out.println("Parent method");

    }

    void run() {

    }
}

class Check extends FinalkEY  {
    int speedlimit=900;
    void add(){
        System.out.println("add");
    }

    @Override
    void run() {
        System.out.println(super.speedlimit);
        System.out.println(this.speedlimit);
        super.add();

        this.add();
        System.out.println("Run Child Method");
    }

    public static void main(String args[]) {
        Check obj = new Check();

        obj.run();
    }
}


