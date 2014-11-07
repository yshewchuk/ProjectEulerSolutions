
public class Problem16
{
	public static void main(String[] args)
	{
		byte[] digits = new byte[500];
		
		digits[0] = 1;
		int nonZeroDigits = 1;
		for (int i = 0; i < 1000; i++)
		{
			byte carry = 0;
			int digit = 0;
			for (digit = 0; digit < nonZeroDigits; digit++)
			{
				digits[digit] = (byte)(digits[digit] * 2 + carry);
				carry = (byte)(digits[digit] / 10);
				digits[digit] = (byte)(digits[digit] % 10);
			}
			
			if (carry != 0)
			{
				digits[digit] = carry;
				nonZeroDigits++;
			}
		}
		
		int sum = 0;
		for (int i = 0; i < nonZeroDigits; i++)
		{
			sum += digits[i];
		}
		System.out.println(sum);
	}
}
