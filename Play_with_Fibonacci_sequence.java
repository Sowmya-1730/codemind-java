import java.util.Scanner;
public class Fibonacci
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1;
        int c;
        for(int i=1;i<=n;i++)
        {
            System.out.printf("%d ",a);
            c=a+b;
            a=b;
            b=c;
        }
    }
}