package Abstraction;
/**
 * Abstraction -> Real life Problem convert programing
 * 1.Unusefull detail hide 
 * 2. Usefull detail show
 * 
 * Two types  
 * 2. Interfaces(Pure Abstraction)
 * 1. All the filds in Interface are   -public - static -final by default
 * 2. All method are public & abstract by default
 * 3. A class that implements an 
 * interface must implemts -> all 
 * this methods declared in the interface
 * 4. Interface support  multiple inheritance
 * 
 */

 interface  Animal{
     int eyes =2;
void walk(); 
// these method are by default abstract and public both
  
  }
 interface Dog{

 }
  class Horse implements Animal, Dog { 
      public void walk(){
          System.out.println("Have  4 Fore Leg to walk");
      }
  }
 public class Interface {
 
     public static void main(String[] args) {
         Horse h1=new Horse();
         h1.walk();
        
     }
 }