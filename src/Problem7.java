import java.util.List;


public class Problem7
{
	public static void main(String[] args)
	{
		List<Long> primes = Primes.buildPrimes(1000000l);
		System.out.print(primes.get(10000));
	}
}
