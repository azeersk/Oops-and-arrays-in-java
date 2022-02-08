class Employee{
    public void EmpOne(String name, int id, int salary){
        System.out.println("EName: "+name);
        System.out.println("EId: "+id);
        System.out.println("ESalary: "+salary);
    }

}

class Programmer extends Employee{
    public void programmerOne(String name, int id, int salary){
        System.out.println("PName: "+ name);
        System.out.println("PId: "+ id);
        System.out.println("PSalary: "+ salary);
    }
}

class Coder extends Programmer{
    public void CoderOne(String name, int id, int salary){
        System.out.println("CName: "+ name);
        System.out.println("CId: "+ id);
        System.out.println("CSalary: "+ salary);
    }
}

 class MainInheritance {
    public static void main(String[] args){

        String name = "Vishnu";
        int id = 118055;
        int salary = 1200000;
        Programmer objOne = new Programmer();
        System.out.println("Employee Details:");
        objOne.EmpOne(name, id, salary);
        System.out.println();
        System.out.println("Programmer Details:");
        objOne.programmerOne(name, id, salary);
        Coder objTwo = new Coder();
        System.out.println();
        System.out.println("Coder Details:");
        objTwo.CoderOne(name, id, salary);
    }
}
