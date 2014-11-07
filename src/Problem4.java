
public class Problem4
{
	public static void main(String[] args)
	{
		Long largest = 0l;
		for (Long i = 100l; i < 1000l; i++)
		{
			for (Long j = 100l; j < 1000l; j++)
			{
				if (Palindromes.isPalindrome(i * j) && i * j > largest)
				{
					largest = i * j;
				}
			}
		}
		
		System.out.print(largest);
	}
}
