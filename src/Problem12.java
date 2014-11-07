import java.util.List;
import java.util.ArrayList;


public class Problem12
{
	public static void main(String[] args)
	{
		int minDivisors = 500;
		
		List<Long> factors = new ArrayList<Long>();
		Long currentValue = 0l;
		Long i;
		for (i = 1l; ; i++)
		{
			currentValue += i;
			
			factors = Factors.factors(currentValue);
			if (factors.size() > minDivisors)
			{
				break;
			}
		}
		
		System.out.print(currentValue);
	}
}
