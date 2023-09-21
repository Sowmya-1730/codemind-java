import java.util.Scanner;
public class Primes
{
    static boolean isPrime(int n)
    {
        // 0 and 1 are not prime numbers
        // negative numbers are not prime
        int cnt=0;
        if(n<=1)
            return false;
        // special case as 2 is the only even number that is prime
        else if (n==2)
            return true;
        // Check if n is a multiple of 2 thus all these won't be prime
        else if(n%2==0)
            return false;
        // If not, then just check the odds
        for(int i=3;i<=Math.sqrt(n);i+=2)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int pc=0;
        for(int i=m;i<=n;i++)
        {
            if(isPrime(i))
            {
                pc++;
            }
        }
        System.out.println(pc);
    }
}