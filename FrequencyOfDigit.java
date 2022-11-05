 // Write a program to find frequency of each digit in a given integer.
 import java.util.Scanner;
class FrequencyOfDigit
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      int temp,rem,num,i,count=0;
      {
        System.out.println("enter the number");
        num=sc.nextInt();
        System.out.println("Frequency of numbers");
        for(i=0;i<9;i++)
          {
            count=0;
            temp=num;
            while(temp>0)
              {
                rem=temp%10;
            if(rem==i)
            {
              count++;
            }
            temp=temp/10;
          }
        if(count>0)
        {
          System.out.println(i+"  "+count);
        }
      }
    }
    }
  }
/*
 import java.util.Scanner;
class FrequencyOfDigit
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      int count=0,numb,temp,i,rem;
      System.out.println("Enter the number:");
      numb=sc.nextInt();
      System.out.println("Frequencies of number;");
      for(i=0;i<=9;i++)
        {
          count=0;
          temp=numb;
          while(temp>0)
            {
              rem=temp%10;
              if(rem==i)
              {
               count++;  
              }
              temp=temp/10;
            }
         if(count>0)
         {
           System.out.println(i+"------->"+count);
         }
        }
    }
  }*/