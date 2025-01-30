public class Inheritance {
    public static void main(String[] args) {
        engineer e1 = new engineer(30);
        e1.name = "Tanish";

        // employee emp1 = new employee();

        // System.out.println(e1 instanceof engineer); //True
        // System.out.println(e1 instanceof employee); //True
        // System.out.println(emp1 instanceof engineer); //False
        System.out.println(e1.name +" "+ e1.bounus);

        e1.print();

        // employee emp2 = new engineer(3); //employee bnao engenner se

    }

}

class employee {
    int salary;
    String name;

    employee(int salary, String name) {
        this.name = name;
        this.salary = salary;
    }
    
    void print(){
        System.out.println("Parent Class");
    }
    

}

class engineer extends employee { // single level inheritance
    int bounus;

    engineer(int bounus) {
        
        super(1000, "Tanish"); // Super is to access parent class function in child class 
        this.bounus = bounus;
    }

    void print(){
        super.print(); // access hidden method in parent class
        System.out.println("Child Class");
    }

}
