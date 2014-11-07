import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Factors
{
	public static List<Long> factors(Long val)
	{
		ArrayList<Long> lowFactors = new ArrayList<Long>();
		LinkedList<Long> highFactors = new LinkedList<Long>();
		
		for (Long i = 2l; i <= Math.sqrt(val); i++)
		{
			if (val % i == 0)
			{
				lowFactors.add(i);
				highFactors.addFirst(val / i);
			}
		}
		
		lowFactors.addAll(highFactors);
		return lowFactors;
	}
}
