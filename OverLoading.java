/*If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.

If we have to perform only one operation, having same name of the methods increases the readability of the program.*/
class Adder
{  
static int add(int a,int b)
  {
  return a+b;
  }  
static double add(double a,double b)
{
  return a+b;
}  
}  
class OverLoading
{  
public static void main(String[] args)
  {  
System.out.println(Adder.add(11,11));  
System.out.println(Adder.add(12.3,12.6));  
}
}  