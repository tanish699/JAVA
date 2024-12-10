public class Math_class {
    public static void main(String[] args) {
        
        double x = 10.98;
        double y = -3.33;
        double z = 4;

        double Mx = Math.max(x, y);     //to find Greatest numb
        double Mn = Math.min(x, y);     //to find Smallest numb
        double Absolute = Math.abs(Mn); //to find absolute value of a numb i.e without negative sign
        double sqroot = Math.sqrt(z);   //to find sqaure root of a number
        double Rnd = Math.round(x);     //to round of a number
        double Rndup = Math.ceil(x);     //to roundup of a number
        double Rnddown = Math.floor(x);     //to rounddown of a number


        System.out.println("Max Numb is " +Mx); 
        System.out.println("Min Numb is " +Mn);
        System.out.println("Absolute value is " +Absolute);  
        System.out.println("Square root " +sqroot);
        System.out.println("Round of a numb " +Rnd);
        System.out.println("Roundup of a numb " +Rndup);
        System.out.println("Rounddown of a numb " +Rnddown);

    }

    
    
}
