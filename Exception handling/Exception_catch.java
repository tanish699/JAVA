public class Exception_catch {
    public static void main(String[] args) {
        
        try{
            int[] arr = new int[3];
            System.out.println(arr[3]);
        }

        catch(Exception ex){
            System.out.println(ex.getMessage());
        }

        finally{
            System.out.println("Finally Block");
        }

        System.out.println("Hello all!");
    }
    
}
