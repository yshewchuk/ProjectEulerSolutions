import java.util.Collection;
import java.util.LinkedList;


public class CollectionExt
{
	public static Long sum(Collection<Long> arr)
	{
		Long sum = 0l;
		for (Long val : arr)
		{
			sum += val;
		}
		return sum;
	}
	
	public static Long maxRunningProduct(Collection<Long> arr, int runLength)
	{
		LinkedList<Long> runList = new LinkedList<Long>();
		int zeroCount = 0;
		
		Long maxRunningProduct = 0l;
		Long runningProduct = 1l;
		
		for (Long val : arr)
		{
			if (runList.size() == runLength)
			{
				if (runList.getFirst() == 0)
				{
					zeroCount--;
				}
				else
				{
					runningProduct /= runList.getFirst();
				}
				runList.removeFirst();
			}
			
			runList.addLast(val);

			if (val != 0)
			{
				runningProduct *= val;
			}
			else
			{
				zeroCount++;
			}
			
			if (zeroCount == 0 && runningProduct > maxRunningProduct)
			{
				maxRunningProduct = runningProduct;
			}
		}
		
		return maxRunningProduct;
	}
}
