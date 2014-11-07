
public class Problem14
{
	public static void main(String[] args)
	{
		int max = 1000000;
		
		int[] lengths = new int[max / 2 + 1];
		lengths[1] = 1;
		
		int maxLength = 1;
		int val = 1;
		for (int i = 2; i <= max; i++)
		{
			int len = getCollatzLength((long)i, lengths);
			if (len > maxLength)
			{
				maxLength = len;
				val = i;
			}
		}
		
		System.out.println(val + " " + maxLength);
		
		maxLength = 1;
		Long maxVal = 1l;
		for (Long i = 1l; i < max; i++)
		{
			int len = collatzLength(i);
			if (len > maxLength)
			{
				maxLength = len;
				maxVal = i;
			}
		}

		System.out.println(maxVal + " " + maxLength);
		
		Long output = longestCollatzChainStart((long)max);
		
		System.out.println(output);
	}
	
	public static int collatzLength(Long val)
	{
		if (val == 1l)
		{
			return 1;
		}
		
		return collatzLength(val % 2l == 1 ? 3l * val + 1l : val / 2l) + 1;
	}
	
	public static void setCollatzLength(int index, int[] lengths)
	{
		if (lengths[index] != 0)
		{
			return;
		}

		Long next = index % 2 == 1 ? 3l * index + 1l : index / 2l;
		if (next < lengths.length)
		{
			setCollatzLength(next.intValue(), lengths);
		}
		
		lengths[index] = getCollatzLength(next, lengths) + 1;
	}
	
	public static int getCollatzLength(Long value, int[] lengths)
	{
		if (value < lengths.length)
		{
			setCollatzLength(value.intValue(), lengths);
			return lengths[value.intValue()];
		}
		
		return getCollatzLength(value % 2l == 1 ? 3l * value + 1l : value / 2l, lengths) + 1;	
	}
	
	public static Long longestCollatzChainStart(Long maxValue)
	{
		ChainDefinition start = new ChainDefinition();
		start.Length = 1l;
		start.Start = 1l;
		start = longestCollatzChain(start, maxValue);
		System.out.println(start.Length);
		return start.Start;
	}
	
	public static class ChainDefinition
	{
		Long Length;
		Long Start;
	}
	
	public static ChainDefinition longestCollatzChain(ChainDefinition start, Long maxValue)
	{
		if (start.Length > 600)
		{
			return start;
		}
		
		ChainDefinition longest = start; 
		
		if (start.Start <= Long.MAX_VALUE / 2l)
		{
			Long evenPossibility = start.Start * 2l;
			ChainDefinition even = new ChainDefinition();
			even.Start = evenPossibility;
			even.Length = start.Length + 1l;
			even = longestCollatzChain(even, maxValue);
			if (even.Start <= maxValue)
			{
				longest = even;
			}
		}
		
		Long oddPossibility = (start.Start - 1l) / 3l;
		if ((start.Start - 1l) % 3 == 0 && oddPossibility % 2 == 1 && oddPossibility != 1l)
		{
			ChainDefinition odd = new ChainDefinition();
			odd.Start = oddPossibility;
			odd.Length = start.Length + 1l;
			
			odd = longestCollatzChain(odd, maxValue);
			if (odd.Length > longest.Length && odd.Start <= maxValue)
			{
				longest = odd;
			}
		}
		
		return longest;
	}
}
