

class Parent {
void House(){
    System.out.println("Parent House Property");
}
    void Car(){
        System.out.println("Parent Car Property");
    }


}


class Child extends Parent {
    void childCar(){
        System.out.println("Child Car");
  }

}

class AnotherChild extends Child{
    void anotherChild(){
        System.out.println("Another Child Property");
        }
        }


public class Inheritance {

    public static void main(String[] args) {

        AnotherChild a=new AnotherChild();
        a.House();
        a.Car();
        a.childCar();
        a.anotherChild();


    }
}
