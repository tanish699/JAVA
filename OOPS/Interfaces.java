public class Interfaces {
    /*Works on blur print/ refrence of other classes */

    public static void main(String[] args) {
        
        //Creating object of interface
        //Example ex = new Example();   // can't make objects of interfaces
        
    }
    
}


interface Animal{
    int a = 10;     // constant by default
    void makes_sound();

    // protected void protected_fun(){
    //     System.out.println("Can't create protected method in Interfaces");
    // }
    private void hello(){
        System.out.println("Hello");
    }
    default void print(){
        hello();
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
