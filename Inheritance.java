class Inheritance2
  {
  int Stu_num=14;
  String Stu_name="bhanu prakash";
  }
class Inheritance extends Inheritance2
  {
    String Stu_parent_Name="Rangappa";
      public static void main(String[]args)
        {
         Inheritance h=new Inheritance();
        System.out.println(h.Stu_name);
        System.out.println(h.Stu_num);
          System.out.println(h.Stu_parent_Name);  
        }
       
    }
  