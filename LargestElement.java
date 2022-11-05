import java.util.Scanner;

public class LargestElement
{
  public static void main(String[]args)
  {
	 Scanner sc=new Scanner(System.in);
	 {
		int n,i,Lar,Posi = 0;
		sc = new Scanner(System.in);		
		System.out.println("\nPlease Enter the LRG size : ");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter LRG elements  :");
		for(i = 0; i < n; i++) 
    {
			arr[i] = sc.nextInt();
		}
		Lar = arr[0];
		for(i = 1; i < n; i++) 
    {
			if(Lar < arr[i]) 
      {
				Lar = arr[i];
				Posi = i;
			}
		}
		System.out.println("Largest element in LRG Array = "+Lar);
		System.out.println("Index position of the Largest element = "+Posi);
	}
}
}