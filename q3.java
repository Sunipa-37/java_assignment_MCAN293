public class q3{
    static String [] k= {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public  static void combination(String digit,int index, String ans) {
        if (index==digit.length()){
            System.out.println(ans);
            return;
        }
        char currentdigit = digit.charAt(index);
        String mappingStr =k[currentdigit-'0'];
        for(int i=0;i<mappingStr.length();i++){
            char currchar=mappingStr.charAt(i);
            combination(digit,index+1,ans+currchar);
        }
    }
    public static void main(String arg[]){
        String digit="23";
        combination(digit,0,"");
    }
}
