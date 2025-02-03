public class String_Buffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb);
        sb.append(" World");
        System.out.println(sb);

        // length
        sb.length();

        //char at index
        sb.charAt(3);

        //set char
        sb.setCharAt(0, 'h');
        
        //delete char
        sb.deleteCharAt(3);

        //delete substring
        sb.delete(3, 6);

        //replace substring
        sb.replace(0, 3, "hi");

        //convert buffer to string
        sb.toString();

        //convert string to buffer
        String str = "hello";
        sb = new StringBuffer(str);
        
    }
    
}
