public class IMMUTABLE_Class {
    /*
     * Immutable classs
     * Which objects can't be modified
     * ->data members should be private
     * -> should have only getters();
     * -> can make final
     *
     -> make class find so it can't be inherit
     */

     public static void main(String[] args) {
        
        Mutable m1 = new Mutable();
        m1.x = 10;

        Immutable im = new Immutable(10,20,m1);

     }
    
}

class Mutable{
    int x;
}

final class Immutable{
   final private int a;
   final private int b;
   final Mutable m;

   Immutable(int a, int b, Mutable m){
    this.a = a;
    this.b = b;
//    this.m = m; //can be changed due to shallow copy

    this.m = new Mutable();
    this.m.x = m.x;

    

   }
     
    int get_a(){
        return this.a;
    }
    int get_b(){
        return this.b;
    }
    Mutable get_m(){
        return this.m;
    }

    void print(){
        System.out.println("a : " + this.a);
        System.out.println("b : " + this.b);
        System.out.println("m : " + this.m);
        System.out.println("a : " + a);
    }

}
