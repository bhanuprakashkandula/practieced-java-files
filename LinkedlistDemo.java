import java.util.*;
class LinkedlistDemo
  {
    public static void main(String[]args)
    {
      LinkedList<String> list=new LinkedList<String>();
      list.add("bhanu");
      list.add("linga");
      list.add("upendra");
      list.add("lakshman");
      list.add("bhanu");
      {
        System.out.println(list);
      }
      list.remove("linga");
      {
         System.out.println(list);
      }
      list.add("mokshagna");
      {
        System.out.println(list);
      }
     list.removeLast(); 
      {
      System.out.println(list);  
      }
       list.remove(2);
      {
        System.out.println(list);
      }
    }
  }