import java.util.HashSet;


public class Problem44
{
	public static void main(String[] args)
	{
		HashSet<Long> pentNumbers = new HashSet<Long>();
		Long i = 1l;
		while (true)
		{
			Long pent = pentagonalNumber(i);
			
			Long high = i - 1l;
			Long low = 1l;
			
			while (high >= low)
			{
				Long highPent = pentagonalNumber(high);
				Long lowPent = pentagonalNumber(low);
				
				if (highPent + lowPent < pent)
				{
					low++;
				}
				else if (highPent + lowPent > pent)
				{
					high--;
					low--;
				}
				else if (highPent + lowPent == pent)
				{
					System.out.println(pent);
					System.out.println(highPent);
					System.out.println(lowPent);
					if (pentNumbers.contains(highPent - lowPent))
					{
						System.out.println(highPent - lowPent);
						return;
					}
					System.out.println();
					high--;
					low--;
				}
			}
			
			pentNumbers.add(pent);
			i++;
		}
	}
	
	public static Long pentagonalNumber(Long sequence)
	{
		return (3l * sequence * sequence - sequence) / 2l;
	}
}
