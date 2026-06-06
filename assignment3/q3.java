abstract class Payment{
    String tId;
    int amount;
    Payment(String tID , int amount){
        this.tId=tID;
        this.amount=amount;

    }
    void paymentprocessing(){
        System.out.println("payment processing");
    }
}
class CreditCardPayment extends Payment{
    CreditCardPayment(String tID,  int amount){
        super(tID, amount);
    }
    void paymentprocessing(){
        System.out.println("total payable amount: "+(amount+(amount*0.02)));

    }
}
class PaypalPayment extends Payment{
    PaypalPayment(String tID,  int amount){
        super(tID, amount);
    }
    void paymentprocessing(){
        System.out.println("total payable amount: "+(amount+(amount*0.03)));

    }
}
public class q3 {
    public static void main(String[] args) {
        Payment obj1 = new CreditCardPayment("CC101", 5000);
        Payment obj2 = new PaypalPayment("PP202", 5000);

        obj1.paymentprocessing();
        System.out.println();
        obj2.paymentprocessing();
    }
}
