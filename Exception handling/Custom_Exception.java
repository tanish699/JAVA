
class InsufficientBalance extends Exception{
    InsufficientBalance(String msg){
        super(msg);
    }
}

class InvalidSenderUPI extends RuntimeException{
    private int errorCode;
    InvalidSenderUPI(int code, String msg){
        super(msg);
        this.errorCode = code;
    }
}

public class Custom_Exception {
    static void sendMoney(int amount, String UPI)throws InsufficientBalance{
        if(amount > 500){
            throw new InsufficientBalance("Not Enough Balance In your account");
        }
        if(!UPI.equals("8699982310")){
            throw new InvalidSenderUPI(201, "Enter Valid UPI ID");
        }
    }
    
    public static void main(String[] args) {
        
    }
}
