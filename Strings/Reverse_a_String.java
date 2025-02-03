public class Reverse_a_String {
    public static void main(String[] args) {
        String a = "Hello World";
        String r = "";
        
        for (int i = a.length() - 1; i >= 0; i--) {
            r += a.charAt(i);
        }
        
        System.out.println("Reversed String: " + r);
    }
   
    
}     
