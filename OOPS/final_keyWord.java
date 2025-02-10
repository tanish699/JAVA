public class final_keyWord {
public static void main(String[] args) {
    

    //creating obj of final class
    Parent p1 = new Parent();
    p1.name = "Tanish";
    p1.name = "WADHWA";
    System.out.println(p1.name);
   

    // creating final objects
    final pair pair1 = new pair();
    pair1.a = 1;
    pair1.a = 2;
    System.out.println(pair1.a);
}

}

final class Parent{

    String name;

}

// class child extends parent{  // can't inherit final class

//   int age;
 
// }

class pair{
    int a;
    int b;
}