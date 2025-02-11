public class Interfaces {
    /*Works on blur print/ refrence of other classes */

    public static void main(String[] args) {
        
        //Creating object of interface
        //Example ex = new Example();   // can't make objects of interfaces
        
    }
    
}


interface Animal {
    int a = 100;
   void makes_sound();
    // Constructor
    // Animal(){
    //     System.out.println("Interfaces can't have constructors");
    // }
    default void print(){
        System.out.println("A default method in Interface");
    }
}

interface DOG extends Animal{

}

class Cat implements Animal {
   @Override
   public void makes_sound(){
    System.out.println("cat meows");
   }
    
}
