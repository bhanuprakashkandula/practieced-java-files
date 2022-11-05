class Practiece_10
  { 
    public static void main(String[]args)
    {
      String str="Bhanu prakash kandula";
        String reverse="";
      for(int i=str.length()-1;i>=0;i--)
        {
        reverse=reverse+str.charAt(i);  
        }
      System.out.println(""+reverse);
    }
  }
/*public class Practiece_10
  {
    public static void main(String[] args)
    {
        String blogName = "java2blog";
        String reverse = "";
        for (int i = blogName.length() - 1; i >= 0; i--)
          {
            reverse = reverse + blogName.charAt(i);
          }
        System.out.println("Reverse of java2blog is: " + reverse);
    }
}*/