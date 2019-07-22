abstract class Bike {
        abstract void run();
        void sharath(){
            System.out.println("No work Sharatjh");
        }
    }


    class Honda4 extends Bike{
        void run(){
            System.out.println("running safely");
        }
        public static void main(String args[]){
            Honda4 oh=new Honda4();
            Bike obj = new Honda4();
            obj.sharath();
            obj.run();
        }
    }

