//SINGEL iNHERITANCE
// Base Class - Drived Class 
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

public class OOPS {
    public static void main(String[] args) {
        Trangle t1=new Trangle();
        t1.area(20,12);
    }
}
