

interface A{
    void print();
}
abstract class C{
    abstract void print();
}
public class Anonymous_class {
       public static void main(String[] args) {
        A obj = new A() {
            public void print(){
                System.out.println("I'm anonymous class");
            }
        };
        obj.print();
      


// anonymous class from abstract class
C obj1 = new C(){
    void print(){
        System.out.println("Anonymous class");
    }
};
obj1.print();
}    
}