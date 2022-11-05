import java.util.*;
class Vector
  {
    public static void main(String[]args)
    {
    Vector<object>List=new Vector<object>();
      list.add(new Date());
      list.add(new Integer(1000));
      list.add("BitLabs");
      list.add(new float(43040.39f));
      for(int i=0;i<List.size();i++)
        {
          System.out.println(list.ElementAt(i));
        }
    }
    }