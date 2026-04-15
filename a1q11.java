import java.util.Scanner;

class Second {
    int poww(int b, int e) {
        int result = 1;

        for (int i = 1; i <= e; i++) {
            result = result * b;
        }

        return result;
    }
}

public class a1q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        Second obj = new Second();
        System.out.print(obj.poww(a, b));
    }
}