public class Inheritance {
    public static void main(String[] args) {
        engineer e1 = new engineer();
        e1.name ="Tanish";

        employee emp1 = new employee();

        System.out.println(e1 instanceof engineer);
        System.out.println(e1 instanceof employee);
        System.out.println(emp1 instanceof engineer);


        employee emp2 = new engineer(); //employrr bnao engenner se

    }
    
}

 class employee {
    int salary;
    String name;
    employee(){
        System.out.println("Employee");
    }
    
}

class engineer extends employee{  //single level inheritance
    int bounus;
    engineer(){
        System.out.println("Eng");
    }

}
