public class abstraction {
    /*
     * Abstraction
     * ->process of hiding complex -implementation from user
     * ->showing functionality to user
     * 
     * 
     */
    public static void main(String[] args){

        // cannot make objects of abtract vlass
        // MotorVehicle mv = new MotorVehicle();
       }
    
    
}

abstract class MoterVehicle{  //ab motervehicle ka object create nhi ho skta
    abstract void Start();
    // abstract private void abstract_method();  //can't be private
    // abstract private static static_method();  //can't be private
    // abstract private void final_method();  //can't be private
    void print(){
        System.out.println("I'm Abstract Class");
        
    }
}

abstract class scooter extends MoterVehicle{
    /*Class must be abstract beCAUSE IT IS NOT implimenting any abstract method in parent class   */
}

class car extends MoterVehicle{
    void Start(){
        System.out.println("Starts From Key");
    }
}

class bike extends MoterVehicle{
    void Start(){
        System.out.println("Starts from kick");
    }
}

  
