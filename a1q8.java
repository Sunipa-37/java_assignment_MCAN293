import java.util.Scanner;

class second{
    int gcd( int a ,int b){
        int c=1;
        for (int i=1;(i<a)&&(i<b);i++){
            if(a%i==0 && b%i==0){
                c=i;
            }
            else{
                break;
            }
        }
        return c;

    }
}
class a1q8{
    public static void main(String ar[]){
    int a ,b,c;
    Scanner sc =new Scanner(System.in);
    a=sc.nextInt();
    b=sc.nextInt();
    second obj = new second();
    c=obj.gcd(a, b);
    System.out.println(c);
}
}