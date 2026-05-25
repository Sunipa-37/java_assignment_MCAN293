import java.util.Scanner;
class second{
    boolean prime(int n){
        if (n < 2)
            return false;
        for (int i = 2; i <= n / 2; i++){
            if (n % i == 0) 
                return false;
        }
        return true;
    }
    void sumprime(int n){
        int c=0;
        for (int i = 2; i <= n / 2; i++) {
            if (prime(i) && prime(n - i)) {
                System.out.println("Yes: " + i + " + " + (n - i));
                c=1;
            }
            if (c==1)
                break;
        }
        if(c==0)
        System.err.println("No.");
    }

}

public class a1q13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        second obj = new second();
        obj.sumprime(n);
    }
}