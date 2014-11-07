import java.util.ArrayList;
import java.util.List;


public class Primes
{
	public static List<Long> buildPrimes(Long max)
	{
		ArrayList<Long> primes = new ArrayList<Long>();
		for (Long i = 2l; i <= max; i++)
		{
			if (isPrime(i, primes))
			{
				primes.add(i);
			}
		}
		return primes;
	}
	
	public static boolean isPrime(Long val)
	{
		for (Long prime : buildPrimes(new Double(Math.sqrt(val)).longValue()))
		{
			if (val % prime == 0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static boolean isPrime(Long val, List<Long> primes)
	{
		for (Long prime : primes)
		{
			if (val % prime == 0)
			{
				return false;
			}
			
			if (prime > Math.sqrt(val))
			{
				return true;
			}
		}
		return true;
	}
}
