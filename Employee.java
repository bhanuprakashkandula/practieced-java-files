 class Programmer
   {
     int Emp_Id=101;
     String Emp_Name="Bhanu";
     String Date_of_join="04/06/2022";
   }
class Employee extends Programmer
  {
    int Salary=35000,Bonus=10000;
      public static void main(String[]args)
    {
      Employee y=new Employee();
      System.out.println(""+y.Emp_Id);
      System.out.println(""+y.Emp_Name);
      System.out.println(""+y.Date_of_join);
      System.out.println(""+y.Salary);
      System.out.println(""+y.Bonus);
    }
  }
