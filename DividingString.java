 /*class DividingString 
 {  
    public static void main(String[] args) 
   {  
          String str = "bhanuprakash";  
  
        //Stores the length of the string  
        int len = str.length();  
        //n determines the variable that divide the string in 'n' equal parts  
        int n = 3;  
        int temp = 0, chars = len/n;  
        //Stores the array of string  
        String[] equalStr = new String [n];  
        //Check whether a string can be divided into n equal parts  
        if(len % n != 0) {  
            System.out.println("Sorry this string cannot be divided into "+ n +" equal parts.");  
        }  
        else {  
            for(int i = 0; i < len; i = i+chars) {  
                //Dividing string in n equal part using substring()  
                String part = str.substring(i, i+chars);  
                equalStr[temp] = part;  
                temp++;  
            }  
    System.out.print(n + " equal parts of given string are ===");  
            for(int i = 0; i < equalStr.length; i++) {  
                System.out.println(equalStr[i]);  
                }  
            }  
        }  
}*/  
 /*class DividingString
   {
     public static void main(String[]args)
     {
     String str="Bhanuprakash";
     int len=str.length();
     int n=2;
     int temp=0,chars=len/n;
     String[] equalsstr=new String[n];
      /* if(len%n!=0)
       {
         System.out.println(n+"the given string is not divided bu three parts");
       }
       else
       {
         for(int i=0;i<len;i=i+chars)
           {
             String part=str.substring(i,i+chars);
             equalsstr[temp]=part;
             temp++;
           }
         System.out.println(n+"");
         for(int i=0;i<equalsstr.length;i++)
           {
             System.out.println(equalsstr[i]);
           }
       }
     }*/
   //}
 