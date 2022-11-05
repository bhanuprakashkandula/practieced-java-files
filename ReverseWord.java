
public class ReverseWord 
{
	public static void main(String[] args) 
  {
		String revStrWords = "Welcome to bitlabs";
		int j, i = 0; 
		String[] strArray = revStrWords.split(" ");
		while(i < strArray.length) 
		{
			char[] ch = strArray[i].toCharArray();
			j = ch.length - 1;
			while(j >= 0) 
			{
				System.out.print(ch[j]);
				j--;
			}
			System.out.print(" ");
			i++;
		}
	}
}
