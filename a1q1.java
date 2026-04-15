import java.util.Scanner;

class second{
    void fibbonaci(int x){
        int a=-1;
        int b=1;
        int i,c;
        for (i=0;i<x;i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
class a1q1{
    public static void main(String a[]) {
        int x;
        Scanner sc= new Scanner(System.in);
        x = sc.nextInt();
        second  obj = new second();
        obj.fibbonaci(x);
    }
}

