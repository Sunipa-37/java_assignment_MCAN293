import java.util.Scanner;

class second{
    void series(int n){
        int a=-1;
        int b=1;
        int c,t=-1;
        for(int i=0;i<n;i++){
            if (i%2==0){
                c=a+b;
                System.out.print(c+" ");
                a=b;
                b=c;
            }
            else{
                System.out.print(t+" ");
                t-=3;
            }
        }
    }
}class a1q5 {
    public static void main(String a[]){
        System.out.print("enter the limit of sereis:");
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        second obj = new second();
        obj.series(n);


    }
}
