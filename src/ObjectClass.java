class Car{
    public void CarDetails(){
        System.out.println("Car name: Ferrari");
        System.out.println("Car color: Red");
        System.out.println("Car model: FR223");
    }
    public void CarFeatures(int maxSpeed, int minSpeed){
        System.out.println("Maximum speed is: "+ maxSpeed);
        System.out.println("Minimum speed is: "+ minSpeed);
    }

    //constructors

    void Car(){
        System.out.println("Car is a constructor without parameters!");
    }
    void Car(String a, String b){
        System.out.println("First parameter is: "+ a);
        System.out.println("Second parameter is: "+ b);
    }
    static String College = "Lovely Professional";
    String name;
    int rollNo;
    public void studentOne(String Name, int Roll){
        System.out.println("College name: "+ College);
        this.Car();
        this.name = Name;
        this.rollNo = Roll;
        System.out.println("Student: "+ name);
        System.out.println("Roll no: "+ Roll);
    }
}

public class ObjectClass {
    public static void main(String[] args){
        int a = 10;
        int b = 260;
        String name = "Azeer";
        int num = 49;
        Car objectOne = new Car();
        objectOne.CarDetails();
        System.out.println();
        objectOne.CarFeatures(b,a);
        System.out.println();
        System.out.println();
        objectOne.Car();
        objectOne.Car("FirstOne" , "SecondOne");
        System.out.println();
        System.out.println("Student Details: ");
        objectOne.studentOne(name,num);

    }
}
