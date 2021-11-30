// Hierarchial Inheritance -> 
// Base Class -> Derived Class 
 //      | -> Derived Class
class Shape{
    public void area(){
        System.out.println("Display Area of Shape");
    }

}
class Trangle extends Shape{
    public void area( int h, int w){
        System.out.println((1/2)*h*w);
    }

}
class EquilateralTrangle extends Trangle{
    public void area(int l, int b){
        System.out.println(1/2 *l * b);
    }
}

class Circle extends Shape{
    public void area(int r){
        System.out.println(3.14 * r*r);
}
}
public class HierarchialInheriatance {
    public static void main(String[] args) {
        
    }
}
