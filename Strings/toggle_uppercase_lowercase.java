import java.util.Scanner;

public class toggle_uppercase_lowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();  
        StringBuilder toggledStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
        
            if (Character.isLowerCase(ch)) {
                toggledStr.append(Character.toUpperCase(ch));
            }
        
            else if (Character.isUpperCase(ch)) {
                toggledStr.append(Character.toLowerCase(ch));
            }
        
            else {
                toggledStr.append(ch);
            }
        }

        
        System.out.println(toggledStr.toString());

        sc.close();
    }
    
}
