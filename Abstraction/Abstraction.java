/**
 * Abstraction -> Real life Problem convert programing
 * 1.Unusefull detail hide 
 * 2. Usefull detail show
 * 
 * Two types 
 * 1. Abstract class
 * -> Declear abstract class abstract keyword
 * -> It can have abstract and non abstract methods
 * -> it can not be instantiated
 * -> it can have constractors and static methods also
 * 
 * 
 * 2. Interfaces(Pure Abstraction)
 * 1. 
 */

 abstract class Animal{
   abstract void walk(); 
   void seeing(){
         System.out.println("Animal are much better to see!");
     }
     Animal(){
         System.out.println("A Thought about Animal");
     }
 }

 class Horse extends Animal {
Horse(){
    System.out.println("How to created to Horse Chase");
}
     public void walk(){
         System.out.println("Have  4 Fore Leg to walk");
     }
 }
 class Chicken extends Animal{
     Chicken(){
         System.out.println("Usefull are nonvage to eat");
     }
     public void walk(){
         System.out.println("Have two leg to walk");
     }
 }
public class Abstraction {

    public static void main(String[] args) {
        Horse h1=new Horse();
        h1.walk();
        h1.seeing();
    }
}