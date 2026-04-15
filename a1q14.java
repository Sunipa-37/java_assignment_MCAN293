import java.util.Scanner;
class second{
    void palindrome(int n){
        int rev = 0, temp = n;

        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }

        if (temp == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
public class a1q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        second obj = new second();
        obj.palindrome(n);
    }
}