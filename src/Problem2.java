public class Problem2
{
   public static void  main(String[] args)
   {
       int a = 3, b = 5, max = 4000000;
       
       int sum = sumOfEvenFib(a, b, max) + 2;
       
       System.out.print(sum);
   }
   
   public static int sumOfEvenFib(int a, int b, int max)
   {
       int c = a + b;
       if (c <= max)
       {
           return c + sumOfEvenFib(c + b, 2 * c + b, max);
       }
       return 0;
   }
}