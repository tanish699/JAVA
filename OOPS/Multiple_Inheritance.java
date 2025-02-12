
//In case of classes
class A{
    int a;
}

class b{
    int b;
}

// class C extends A, B{  //Classes dosen't Support multiple inhertance
//     int c;
// }

// In Interfaces
interface X{
    void print(); 
}
interface Y{
    void print();
}

interface Z extends X, Y{
    void print();
}

class C implements X, Y{
 public void print(){
    System.out.println("Multiple Inheritance");
 }
}

public class Multiple_Inheritance {
    
}
