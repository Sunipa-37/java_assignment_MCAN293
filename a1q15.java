class second{
    void random(){
        for (int i = 0; i < 5; i++) {
            int num = (int)(Math.random()*240);
            System.out.println(num);
        }
    }
}
public class a1q15 {
    public static void main(String[] args) {
        second obj =new second();
        obj.random();
    }
}