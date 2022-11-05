/*Encapsulation in Java is a process of wrapping code and data together into a single unit, for example, a capsule which is mixed of several medicines.

encapsulation in java
We can create a fully encapsulated class in Java by making all the data members of the class private. Now we can use setter and getter methods to set and get the data in it.*/
class Animal 
  { 
class Dog4 extends Animal 
{  
  static void method(Animal a) 
  {  
       Dog4 d=(Dog4)a;//downcasting  
       System.out.println("ok downcasting performed");  
  }  
   public static void main (String[]args) 
  {  
    Animal a=new Dog4();  
    Dog4.method(a);  
  }  
}
  }