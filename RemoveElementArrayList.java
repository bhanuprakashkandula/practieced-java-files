 //package com.tutorialspoint;
//import java.util.ArrayList;
//import java.util.Arrays;
import java.util.*;

public class RemoveElementArrayList  
  {
   public static void main(String[] args) 
    {
List<Integer> list = new ArrayList<> (Arrays.asList(0,1,2,3,4,5,6,7,8,9));
      System.out.println("List: " + list);
      list.remove(3);
      System.out.println("After remove(1), List: " + list);
   }
}