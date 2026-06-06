abstract class Shape{
    String colour;
    Shape(String colour){
        this.colour =colour;
    }
    void calc_area(){
        System.out.println("this is for calculating area");
    }
    void draw(){
        System.out.println("colour is :"+colour);
    }

}
class Circle extends Shape{
    double radius;
    static double pi = 3.14;
    Circle(String colour,double radius){
        super(colour);
        this.radius = radius; 
    }
    void calc_area(){
        System.out.println("area of circle: "+pi*(radius*radius));
    }
}
class Rectangle extends Shape{
    double l;
    double b;
    Rectangle(String colour , double l, double b){
        super(colour);
        this.l=l;
        this.b=b;
    }
    void calc_area(){
        System.out.println("area of rectangle: "+l*b);
    }

}
public class q4 {
    public static void main(String[] args) {
        Circle c1 = new Circle("red", 12);
        c1.calc_area();
        c1.draw();
        Rectangle r1 = new Rectangle("green", 4, 5);
        r1.calc_area();
        r1.draw();
    }
    
}
