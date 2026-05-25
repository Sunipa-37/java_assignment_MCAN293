import java.util.Scanner;

class second{
    int fact(int n){
        int f=1;
        for (int i=1;i<=n;i++){
            f*=i;
        }
        return f;
    }
    float series(int n){
        float s=0;
        for (int i=1;i<=n;i++){
            s+=(1/fact(i));

        }
        return s;
    }
}
class a1q9 {
    public static void main(String[] args) {
        System.out.print("enter the limit of sereis:");
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        second obj = new second();
        float s=obj.series(n);
        System.out.println(s);
    }
    
}
