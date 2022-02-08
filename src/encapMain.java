class encapOne{
    private int id;
    private int roll;

    public void setId(int i){
        this.id = i;
    }
    public void setRoll(int r){
        this.roll = r;
    }

    public int getId(){
        return id;
    }
    public int getRoll(){
        return roll;
    }
}

class OuterClass{
    public void some(){
        System.out.println("this in outer class!!!");
    }
    static class innerClass{
        public void someIn(){
            System.out.println("this is inner class!!!");
        }
    }
}

public class encapMain {
    public static void main(String[] args){
        encapOne obj = new encapOne();
        int i = 121292;
        int r = 49;

        obj.setId(i);
        obj.setRoll(r);
        System.out.println(obj.getId());
        System.out.println(obj.getRoll());

        OuterClass objOne = new OuterClass();
        OuterClass.innerClass objTwo = new OuterClass.innerClass();
        System.out.println();
        objOne.some();
        System.out.println();
        objTwo.someIn();
    }
}
