class second{
    void prime(){
        int i,j,c,t;
        for(i=2;i<1000;i++){
            t=i;
            c=0;
            for (j=1;j<=t;j++){
                if (t%j==0){
                    c+=1;
                }
            }
            if (c<=2){
                System.out.println(i);
            }
        }
    }
}
class a1q2{
    public static void main(String a[]){
        second obj =new second();
        obj.prime();
    }
}