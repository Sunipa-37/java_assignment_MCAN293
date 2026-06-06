
interface fitnesstracker {
    int step_count = 12;
    void CountStep();
    void calc_Cal();
    
}
interface notificationReciver {
    String notificationmsg="hope you are doing well";
    void rn();
    void dn();
}
class Smartwatch implements fitnesstracker,notificationReciver{
    String watchbrand;
    String model;
    Smartwatch(String watchbrand, String model){
        this.watchbrand=watchbrand;
        this.model=model;
    }
    public void CountStep(){
        System.out.println("step count:"+step_count);
    }
    public void calc_Cal(){
        System.out.println("calories burnt: "+step_count*0.12);
    }
    public void rn(){
        System.out.println("reciving notification");
    }
    public void dn(){
        System.out.println(notificationmsg);
    }
}
class labwork1stjune{
    public static void main(String[] args) {
        Smartwatch aq = new Smartwatch("apple","x123");
        aq.CountStep();
        aq.calc_Cal();
        aq.rn();
        aq.dn();
    }
}