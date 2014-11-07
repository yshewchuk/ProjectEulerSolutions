
public class Problem10
{
	public static void main(String[] args)
	{
		Long limit = 2000000l;

		System.out.print(CollectionExt.sum(Primes.buildPrimes(limit)));
	}
}
