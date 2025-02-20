

class outer{
    //nested class inside class
    class inner{
        int a;
        void print(){
            System.out.println("a : "+a);
        }
    }
}

public class nested_class {
    public static void main(String[] args) {
        
        // outer.inner = new inner(); // Non-static members can't be accesssed directly
        outer obj = new outer();
        outer.inner inner_obj = obj.new inner();
        inner_obj.a = 10;
        inner_obj.print();
    }
}
