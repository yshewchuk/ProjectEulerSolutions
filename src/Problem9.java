
public class Problem9
{
	public static void main(String[] args)
	{
		int sum = 1000;

		for (int a = 1; a < sum; a++)
		{
			for (int b = a; b < sum; b++)
			{
				int c = sum - a - b;
				
				if (a * a + b * b == c * c)
				{
					System.out.print(new Integer(a).toString() + " " + new Integer(b).toString() + " " + new Integer(c).toString() + " " + new Integer(a * b * c).toString());
				}
			}
		}
	}
}
