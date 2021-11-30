package Opps;
import java.sql.Struct;

/*
OOPS-: 
Real Life problem Solve by Programing Using Class and Object
Classes : are BluePrint of your object ,
1. Classes defiend propertis and method
2. ex. PTron is Class - name , type of is propertis 
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

/**
Constructer = 
1. Constrecter Name is CassName
Non Parameter
para meter // inslize variable
copy constrecter
 */
 class Student {
 String name;
  int age;
public void printInfo(){
System.out.println(this.name);
System.out.println(this.age);
}
    Student (){ 
        System.out.println("Constructor called");
    }
    Student (String name, int age){
       this.name=name;
       this.age=age;
    }
    Student (Student s2){
        this.name=s2.name;
        this.age=s2.age;
     }
}

public class OOPS {
    public static void main(String[] args) throws Exception {
        Student s1 =new Student();
        s1.name="Upgrad";
        s1.age=22;
        Student s2=new Student(s1);
       s2.printInfo();
       
    }
}
