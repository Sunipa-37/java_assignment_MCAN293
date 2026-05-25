import java.util.Scanner;

class second{
    void series(int n){
        int i,t=2,k=1;
        for (i=0;i<n;i++){
            if (i%2==0){
                System.err.println(t);
                t+=2;
            }
            else{
                
                int f=1;
                for(int j=1;j<=k;j++){
                    f*=j;
                }
                System.out.println(f);
                k++;
            }
        }
    }
}
class a1q7 {
    public static void main(String a[]){
        System.out.print("enter the limit of sereis:");
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        second obj = new second();
        obj.series(n);


    }
}
