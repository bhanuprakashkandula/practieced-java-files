

import java.util.Scanner;
public class DuplicateElements 
{
 public static void main(String args[])
  {
	Scanner sc=new Scanner(System.in);
   {
		int n, i, j,count = 0;
		System.out.print("\nPlease Enter the Duplicate Array size  : ");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.format("Enter Duplicate Array elements : ");
		for(i = 0; i <n; i++) 
		{
			arr[i] = sc.nextInt();
		}
		for(i = 0; i <n; i++) 
		{
			for(j = i + 1; j <n; j++)
			{
				if(arr[i] == arr[j]) 
        {
					count++;
					break;
				}
			}
		}
		System.out.println("\nThe Total Number of Duplicates  = " +count);
	}
}
}
  
 