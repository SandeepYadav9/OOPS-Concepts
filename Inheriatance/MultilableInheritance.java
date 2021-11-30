// Base Class -> Drived Class -> Drived Classs
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
public class MultilableInheritance {
    public static void main(String[] args) {
        
    }
}
