
class vehicle{
    public void Car(){
        System.out.println("Name: "+ "Ferrari");
        System.out.println("Color: Red");
        System.out.println("Model: FR193");
    }
    public void bike(){
        System.out.println("Name: Tata");
        System.out.println("Color: white");
        System.out.println("Model: Tata32");
    }

    public void Car(int max, int min){
        System.out.println("Maximum Speed is: "+ max);
        System.out.println("Minimum Speed is: "+ min);
    }

    public void bike(int max, int min){
        System.out.println("Maximum speed is: "+ max);
        System.out.println("Minimum speed is: "+ min);
    }

    public void Car(int a, int b, int c){
        System.out.println(a + b+ c);
    }
}

public class overLoadingMain {
    public static void main(String[] args){
        int CMax = 320;
        int CMin = 10;
        int BMax = 240;
        int BMin = 10;
        System.out.println("Car overloading: ");
        vehicle objA = new vehicle();
        objA.Car();
        objA.Car(CMax, CMin);

        System.out.println();
        System.out.println("Bike overloading: ");
        objA.bike();
        objA.bike(BMax, BMin);
        System.out.println();
        System.out.println("Sum of the objects: ");
        objA.Car(12,23,34);

    }
}
