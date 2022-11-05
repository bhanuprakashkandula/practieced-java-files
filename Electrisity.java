/*. Write a JAVAprogram to input electricity unit charges and calculate total     electricity bill according to the given condition:
    For first 50 units Rs. 0.50/unit
    For next 100 units Rs. 0.75/unit
    For next 100 units Rs. 1.20/unit
     For unit above 250 Rs. 1.50/unit
     An additional surcharge of 20% is added to the bill*/
import java.util.Scanner;
class Electrisity
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      int cbn,lr,pr,tu;
      Float cost,totalbill,addcost;
      String name;
      System.out.println("current bill number:");
      cbn=sc.nextInt();
      System.out.println("bill holder name: ");
      name=sc.next();
      System.out.println("last month reading: ");
      lr =sc.nextInt();
      System.out.println("present month reading: ");
      pr =sc.nextInt();
      tu=pr-lr;
       System.out.println("customer number is:"+name);
      System.out.println("customer name is:"+cbn);
      System.out.println("present month reading is:"+pr);
      System.out.println("last month reading:"+lr);
      System.out.println("total units ="+tu);
      if(tu<=50)
        cost=((50*0.5f));
      else if(tu<=100)
        cost=((50*0.5f)+((tu-50)*0.75f));
      else if(tu<=200)
       cost=((50*0.5f)+(50*0.75f)+((tu-100)*1.20f));
       else if(tu>250)
         cost=((50*0.5f)+(50*0.75f)+(100*1.2f)+((tu-100)*1.50f));
      {
      System.out.println("total current bill:  "+cost);
    }
    }
  }