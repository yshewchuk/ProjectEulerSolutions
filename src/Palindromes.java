
public class Palindromes
{
	public static boolean isPalindrome(Long value)
	{
		Long powerOfTen = new Double(Math.log10(value)).longValue();
		
		for (int i = 0; i < powerOfTen / 2 + 1; i++)
		{
			Long low = (value / new Double(Math.pow(10,  i)).longValue()) % 10;
			Long high = (value / new Double(Math.pow(10, powerOfTen - i)).longValue()) % 10;
			
			if (low != high)
			{
				return false;
			}
		}
		
		return true;
	}
}
