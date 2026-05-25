import java.util.Scanner;
class second
{
    void lcp(String [] word)
    {
        String prefix="";
        for (int i = 0; i < word[0].length(); i++)
        {
            char current = word[0].charAt(i);
            for (int j = 1; j < word.length; j++)
            {
                if (i >= word[j].length() || word[j].charAt(i) != current)
                {
                    System.out.println("Longest Common Prefix: " + prefix);
                    return;
                }
            }
            prefix += current;
        }
        System.out.println("Longest Common Prefix: " + prefix);
    }
}
class q1{
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size");
        int n =sc.nextInt();
        String []word= new String[n];
        for (int i=0;i<n;i++){
            word[i]=sc.next();
        }
        second obj =new second();
        obj.lcp(word);
    }
}