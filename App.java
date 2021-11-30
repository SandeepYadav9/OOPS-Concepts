/*
OOPS-: 
Real Life problem Solve by Programing Using Class and Object
Classes : are BluePrint of your object ,
1. Classes defiend propertis and method
2. ex. Maruti is Class - name , type of is propertis 
3. Driving are Methods 
4. Not taking space
Objects- are Run time entity. An object represent a Maruti, Place, items
- Object can axis bothe properties and Method both
*/

class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("write somting !");
    }
   
    public void printColor(){
        System.out.println(this.color);
    }
    
}

public class App {
    public static void main(String[] args) throws Exception {
        Pen s1=new Pen();
        s1.color="Red";
        s1.write();
        s1.printColor();
       
    }
}
