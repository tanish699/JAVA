import java.util.Scanner;

public class string_methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "Tanish ";

        
        System.out.println(name.length());
        System.out.println(name.charAt(4));
        System.out.println(name.indexOf("i", 0));
        System.out.println(name.isEmpty());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.trim()); //removes all empty space 
        System.out.println(name.replace("i", "I"));
    }
    
}
