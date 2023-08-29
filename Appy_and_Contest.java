import java.util.*;
public class Appy
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            long N=sc.nextLong();
            long A=sc.nextLong();
            long B=sc.nextLong();
            long K=sc.nextLong();
            long c=0,m=0,j;
            for(j=1;j<=N;j++)
            {
                if(j%A==0 && j%B!=0)
                {
                    c++;
                }
                else if(j%A!=0 && j%B==0)
                {
                    c++;
                }
                if(c>=K)
                {
                    System.out.println("Win");
                    m=1;
                    break;
                }
            }
            if(m==0)
            {
                System.out.println("Lose");
            }
        }
    }
}