class second{
    void fime(int x){
        int a=1;
        int b=1;
        int i,c,j,f,g;
        g=0;
        for (i=0;i<x;i++){
            c=a+b;
            f=0;
            for(j=1;j<=c;j++){
                if(c%j==0){
                    f++;
                }
            }
            if(f<=2){
                System.out.println(c);
                g++;
            }
            if(g>=8)
                break;
            a=b;
            b=c;
        }
    }
}
class a1q3{
    public static void main(String a[]){
        second obj = new second();
        obj.fime(100);
    }
}