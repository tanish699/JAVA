public class MethodOverriding {
  //Functions are almost same
  /*
   * type of runtime polymorphism
   * function signature is same
           -> method name + parameter name

   * Overriding is done in case of inheritance
   * Return tupe must be same or can be subclass of the actual return type(co-varianrt)
   * 
   * Constructors can't be over-ridden
   * static/private/final methods can't be over-riddenclear
   * 
    @Override annotation can be used while overriding (optional)
   * 
   */
 
    class motor_vehicle{
    
        void start(){
            System.out.println("switch on motor engine");
        }

        motor_vehicle get_Vehicle(){
            return new motor_vehicle();
        }

        static void print(){      //static function can't be overridden
            System.out.println("static method in parent class");
        }

        final void final_fun(){      //final function can't be overridden
            System.out.println("Final function");
        }

        private void func(){      //private function can't be overridden                                               
            System.out.println("private function");
        }
    }
   
    class car extends motor_vehicle{
        void start(){
            System.out.println("Start by key");
        }

        static void print(){
            System.out.println("static method in car(child) class");
        }
    }
    
    class bike extends motor_vehicle{
    
        void start(){
            System.out.println("starts by kick");
        }
    }
   

    public static void main(String[] args) {
       
        
    }
    
}
