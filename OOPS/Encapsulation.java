/* This Keyword
-> stores refrencre of the class within the class
   
 *Access Modifiers
 -> Public =Accesible to all(via objects)
 -> Private =only within the class
 -> Protected =within the class and subclass
 -> Default (no keyword) = within the package
 */


public class Encapsulation {
    public static void main(String[] args) {
        car car1 = new car("Fortuner", "Black", 120);
        // car1.brand = ""; invalid due to private member

        car1.setColor("White");
        System.out.println(car1.getColor());
        System.out.println(car1.getBrand());
        car1.print();


    }
    
}



class car {
    private String Brand;
    private String Color;
    int Speed;

    // car(){  // user made default constructor
    //     brand = "";
    //     color = "white";
    //     speed = 60;
    // }
    car(String brand, String color, int speed){
        this.Brand = brand;
        this.Color = color;
        this.Speed = speed;

        // this.print();
    }

    String getBrand(){
        return this.Brand;
    }

    void setColor(String color){
        this.Color = color;
    }

    String getColor(){
        return this.Color;
    }

    void print(){
        System.out.println("Brand : " + Brand);
        System.out.println("Color : " + Color);
        System.out.println("Speed : " + Speed);
    }

}