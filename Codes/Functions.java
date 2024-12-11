// Functions in java


public class Functions {
      public static void main(String[] args) {
        
        int a= 10;
        int b= 90;
        int answer =sum(a,b);
        System.out.println(answer);
    }
      

    //public static void main(String[] args) ye main function hai just like (int main)
    //Functions main function(public static void main(String[] args)) ke baad define krne hai
    //Function mein  static lgana jruri hai otherwise humme object bnana pdde ga
    
    static int sum(int a, int b){
        int sum_num = a + b;
        return sum_num;
    }
    
}
