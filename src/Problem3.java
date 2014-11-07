import java.util.List;


public class Problem3
{
	public static void main(String[] args)
	{
		long factorize = 600851475143l;

		List<Long> factors = Factors.factors(factorize);
		List<Long> primeFactors = Primes.buildPrimes(new Double(Math.sqrt(factors.get(factors.size() - 1))).longValue());
		
		Long largestPrime = 0l;
		for (int i = factors.size() - 1; i >= 0; i--)
		{
			if (Primes.isPrime(factors.get(i), primeFactors))
			{
				largestPrime = factors.get(i);
				break;
			}
		}
				
		System.out.print(largestPrime);
	}
}
