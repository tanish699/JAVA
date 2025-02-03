
public class BasicsStr {
    public static void main(String[] args) {
        String Str1 = "Tanish"; //Creates the string in string pool
        String Str2 = "Tanish";

        System.out.println(Str1 == Str2); //True; As they are pointing to the same object in string pool.
        System.out.println(Str1.equals(Str2)); //True; As both the strings are same.

        String Str3 = new String("Tanish"); //Creates Strinh heap memory; it creates a new string object.

        String Str4 = new String("Tanish");
        
        System.out.println(Str3 == Str4); //False; As they are pointing to different objects in memory.
        System.out.println(Str3.equals(Str4)); //True; As both the strings are same.
    }
    
}
