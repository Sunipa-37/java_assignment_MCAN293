import java.util.Scanner;
class second{
    void factor(int n){
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

public class a1q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        second obj = new second();
        obj.factor(n);
    }
}