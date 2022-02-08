interface FullAb{

    public void methodOne();
    void methodTwo();

    default void methodThree(){
        System.out.println("This method is using default");
    }
}

class implClass implements FullAb{
    public void methodOne(){
        System.out.println("this is method one!!");
    }

    public void methodTwo(){
        System.out.println("this is method two!!");
    }
}
class implClassTwo extends implClass implements FullAb{
    public void allMethods(){
        super.methodOne();
        System.out.println();
        methodTwo();
        System.out.println();
        super.methodThree();

    }
}
public class InterMain {
    public static void main(String[] args){
        implClass obj = new implClass();
        obj.methodOne();
        System.out.println();
        obj.methodTwo();
        System.out.println();
        obj.methodThree();

        implClassTwo objOne = new implClassTwo();
        System.out.println();
        System.out.println("this is space!!!!!");
        System.out.println();
        objOne.allMethods();

    }
}
