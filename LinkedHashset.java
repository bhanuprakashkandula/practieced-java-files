import java.util.*;
  public class LinkedHashset
    {
     public static void main(String[]args)
      {
        LinkedHashSet<String>set=new LinkedHashSet();
        set.add("Bhanu");
        set.add("Linga");
        set.add("Bhanu");
        set.add("Maha");
        set.add("Upendra");
         set.add(null);
      Iterator<String>i=set.iterator();
        while(i.hasNext())
          {
            System.out.println(i.next());
          }
      }
    }