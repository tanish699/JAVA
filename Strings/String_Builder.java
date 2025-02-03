
public class String_Builder {
    public static void main(String[] args) {
       StringBuilder str = new StringBuilder("Hello");
       StringBuilder str1 = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
       
       //length
       System.out.println(str.length());

       //append
       System.out.println(str.append(" world"));

       // char at index
       System.out.println(str.charAt(4));

       // delete char at index
       System.out.println(str.deleteCharAt(6));

       //insert
       System.out.println(str.insert(1, 'E'));

       //set char (replace)
       str.setCharAt(7, 'z');
       System.out.println(str);

       // reverse
       System.out.println(str.reverse());

       //substring
       System.out.println(str.substring(4));
       System.out.println(str1.substring(1, 15));

       //equals
       System.out.println(str1.equals(2));

       //

    }
    
}
