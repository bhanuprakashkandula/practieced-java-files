/*13. Write a JAVAprogram to input marks of five subjects Physics, Chemistry, Biology,     Mathematics and Computer. Calculate percentage and grade according to     following:
    Percentage >= 90% : Grade A
    Percentage >= 80% : Grade B
    Percentage >= 70% : Grade C
    Percentage >= 60% : Grade D
    Percentage >= 40% : Grade E
    Percentage < 40% : Grade F*/
import java.util.Scanner;
class Marks
  {
    public static void main(String []args)
    {
      Scanner sc= new Scanner(System.in);
      int phy,che,bio,maths,comp,avg,total;
      System.out.println(" enter each subject marks");
      phy=sc.nextInt();
       che=sc.nextInt();
       bio=sc.nextInt();
       maths=sc.nextInt();
       comp=sc.nextInt();
      {
        System.out.println("phy  subject marks:"+" "+phy);
        System.out.println("che  subject marks"+" "+che);
        System.out.println("boi  subject marks"+" "+bio);
        System.out.println("maths  subject marks"+" "+maths);
        System.out.println("comp   subject marks"+" "+comp);
        total=(phy+che+bio+maths+comp);
        System.out.println("total marks"+total);
        avg=(phy+che+bio+maths+comp)/5;
        System.out.println("avg marks ="+avg);
        if(avg<40)
        {
          System.out.println("FAIL");
        }
        else if(avg>=40 && avg<=49)
        {
        System.out.println("GRADE-E");  
        }
         else if(avg>=41 && avg<=59)   
        {
           System.out.println("GRADE-D");
        }
        else if(avg>=60 && avg<=69)
        {
           System.out.println("GRADE-C");
        }
        else if(avg>=70 && avg<=79)
        {
         System.out.println("GRADE-B"); 
        }
         else if(avg>=80 && avg<=90)
         {
           System.out.println("GRADE-A"); 
         }
        else
         {
          System.out.println(" distingtion");  
         }
      }
    }
  }