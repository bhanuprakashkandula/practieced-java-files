class ExtractNumbers
  {
    public static void main(String[]args)
    {
      String str="bhanupraksh23dme";
      System.out.println(str.length());
      for(int i=0;i<str.length();i++)
        {
          char ch=str.charAt(i);
         System.out.println(i+"="+ch); 
          
        }
      //System.out.println(str.replaceAll(regex:"[0-9]", replacement:""));
    }
  }