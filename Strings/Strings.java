public class Strings {
    public static void main(String[] args) {
        String str = "Hello";
        str = str.concat("World");

        System.out.println("str");



        System.out.println(str.length());


        // substring
        System.out.println(str.substring(3,7));
        System.out.println(str.substring(3));


        //compare
        System.out.println(str.equals("Hello"));


        // to upper case
        System.out.println(str.toUpperCase());


        // replace
        System.out.println(str.replace("Hello","World"));


        // find sequence
        System.out.println(str.contains("Hello"));
   }
}

