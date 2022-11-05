class NullPointer
  {
    public static void main(String[]args)
    {
      String str="Bhanu";
      try
      {
      System.out.println(str.length());   
      }
       catch(NullPointerException e)
      {
        System.out.println("Rest of the code");
      }
    }
  }