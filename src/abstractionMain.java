abstract class abstractEx{

    void abstractEx(){
        System.out.println("this is constructor!!");
    }
    public void something(){
        System.out.println("This is abstract class!!!");
    }

    public abstract void abMethod(int a);

    abstract void abstractMethod();
}


class extensionOf extends abstractEx{
    public void abMethod(int a){
        super.something();
        System.out.println("This extensionOf class!!" + a);
    }
    public void abstractMethod(){
        System.out.println("This extensionOf class!! Second");
    }

}
public class abstractionMain {
    public static void main(String[] args){

        extensionOf obj = new extensionOf();
        obj.something();
        System.out.println();
        obj.abMethod(23);
        System.out.println();
        obj.abstractMethod();
        System.out.println();
        obj.abstractEx();


    }
}
