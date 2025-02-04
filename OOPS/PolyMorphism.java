public class PolyMorphism {

    static int SUM(int a){
        return a;
    }
    
    static int SUM(int a, int b){
        return a+b;
    }
    
    static int SUM(int a, int b, int c){ // Overloading by changing number of arguments
        return a+b+c;
    }

    static int SUM(String a, int c){ // Overloading by changing arguments type
        return 404;
    }

    static int SUM(int c, String a){ // Overloading by changing arguments Order
        return 404;
    }

    public static void main(String[] args) {
        /*
         *Polymorphism
         - many forms
         -a function can be called many times

         ->Types

         *Compile time
         =executes at compile time.
         =function declaration must be different
         example- Same bowler bowling pace and spin with different run-up
         =Achieve by method overloading

         ->Run Time
         =executes at run time.
         =function declaration is almost same
         example- a pace bowling slower with almost same bowling action.
         =Achieved by method overriding

        */
        
        System.out.println(SUM(4));
        System.out.println(SUM(2, 3));
        System.out.println(SUM(5, 15, 20));
        System.out.println(SUM(4, "abc"));
        System.out.println(SUM("hi", 5));


        
        
    }
    
}





    

