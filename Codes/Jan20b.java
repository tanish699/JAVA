import java.util.Scanner;

public class Jan20b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   
        String str1 = "hello";
        str1 = str1.concat("world");
        System.out.println(str1);
        str1 = "def";
        System.out.println(str1);
        System.out.println(str1.concat(" hi"));
        str1 = "abcdef";
        String str2 = str1.substring(1, 6);
        System.out.println(str2);
        
        str2 = "abc";
        str1 = "abc";
        String str5 = new String("abc");
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1==str5);
        System.out.println(str1.equals(str5));

        // for(byte i=0; i<128; i++){
        //     System.out.println(i);
        // }

        StringBuilder sb = new StringBuilder("abcdef");
        sb.replace(1, 4, "zzzz");
        System.out.println(sb);


        sc.close();
    }
    
}
