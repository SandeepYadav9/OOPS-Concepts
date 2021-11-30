package Opps;
/*
Polymorphism
1. Compile Time Polymorphosm or Function(Method overLoading) overloading
2. Run Time 
*/

class Student {
    String name;
    int age;

    public void displayInfo(String name){
System.out.println(name);
    }
    public void displayInfo(int age){
        System.out.println(age);
            }
            public void displayInfo(String name, int age){
                System.out.println(name);
                System.out.println(age);
                    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.displayInfo("Monu Imp");
        s1.displayInfo(21);
        s1.displayInfo("girl", 21);
        
    }
}
