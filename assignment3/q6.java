interface translator{
    void translate(String text, String lang);
}
interface speaker{
    void speak(String text);

}
class AI implements translator,speaker{
    

    public void translate(String text, String lang){
        System.out.println(text+" translating to "+lang);
    }
    public void speak(String text){
        System.out.println("speaking :"+text);
    }
}
public class q6 {
    public static void main(String[] args) {
        AI obj =new AI();
        obj.translate("I AM A STUDENT", "FRENCH");
        obj.speak("Je suis étudiante");
    }
}
