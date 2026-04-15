import java.util.Scanner;

class second{
    int fact(int n){
        int f=1;
        for (int i=1;i<=n;i++)
            f*=i;
        return f;
    }
}
class a1q6{
    public static void main(String a[]){
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int c =sc.nextInt();
        second obj =new second();
        int b= obj.fact(c);
        System.out.println(b);


    }
}