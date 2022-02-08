class vehicleOne{
    final int a = 232;
    final String b = "this is message!";
    public void CarRun(){
        System.out.println("Vehicle Class in side!!");
    }

}
class Bike extends vehicleOne{
    public void CarRun(){
        super.CarRun();
        System.out.println("Bike class in side!!");
        System.out.println(super.a);
        System.out.println(super.b);
    }
}

public class overridingMain {
    public static void main(String[] args){
        Bike obj = new Bike();
        obj.CarRun();

    }
}
