class WhileLoop
  {
    public static void main(String[]args)
    {
      int n=1,number,count;
      while(n<=100)
        {
          number=2;
          count=0;
          while(number<=n/2)
            {
              if(n%number==0)
              {
                count++;
                break;
              }
            }
          if(count==0 && n!=1)
          {
            System.out.println(n+"");
          }
        }
      n++;
    }
  }