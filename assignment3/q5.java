interface UPIpayment{
    void viaUPI();
}
interface CardPayment{
    void viacard();
    
}
class Onlinepayment implements UPIpayment, CardPayment{
    public void viaUPI(){
        System.out.println("payment is processing via upi");
    }
    public void viacard(){
        System.out.println("payment is processing via card");
    }
}
public class q5 {
    public static void main(String[] args) {
        Onlinepayment obj =new Onlinepayment();
        obj.viaUPI();
        obj.viacard();
    }
    
    
}
