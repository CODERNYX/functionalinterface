//Example of Functional Interface

interface Sayable{
    void say(String msg);
}

//Invalid Functional Interface
//@FunctionalInterface
//interface Doable extends Sayable{
//    void doIt();
//}
//Object Class method with user defined abstract method
@FunctionalInterface
interface Sayable2{
    void say(String msg);
    int hashCode();
    String toString();
    boolean equals(Object obj);
}

//Functional Interface extending a non-functional interface
interface Doable{
    default void doIt(){
        System.out.println("Do it now");
    }
}
@FunctionalInterface
interface Sayable3 extends Doable{
    void say(String msg);
}

public class FunctionalInterfaceExample implements Sayable3 {
    public static void main(String[] args) {
        FunctionalInterfaceExample fe = new FunctionalInterfaceExample();
        fe.say("Hello! There.");
    }

    @Override
    public void say(String msg) {
        System.out.println(msg);
    }
}
