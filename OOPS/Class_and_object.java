//Create class and objects

public class Class_and_object {
    public static void main(String[] args) {
        
        car car1 = new car();
        car1.brand = "kia";
        car1.Color = "black";
        car1.speed = 120;
        car1.print();

        car car2 = new car("Skoda", "white", 0);
        car2.print();

        car car3 = new car("Sokda", null, 200);
        car3.print();

        car.display();


    }
    
}


class car {
    String Color;
    String brand;
    int speed;

    void print(){
        System.out.println("Brand : "+ brand);
        System.out.println("Color : "+ Color);
        System.out.println("Speed : "+ speed);
    }

    car(){  //override default costructor
        brand = "";
        Color = "White";
        speed = 60;
    }

    car(String b, String c, int s){
        Color = c;
        speed = s;
        brand = b;
    }

    static void display(){  //no need to make object to call static void 
        System.out.println("Static void member");
    }
    
}