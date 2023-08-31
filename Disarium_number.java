import java.util.*;
public class Disarium
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int q=n,len=0,r;
        while(q!=0)
        {
            r=q%10;
            len++;
            q=q/10;
        }
        int p=n,sum=0,r1;
        while(p!=0)
        {
            r1=p%10;
            sum+=Math.pow(r1,len);
            p=p/10;
            len--;
        }
        if(sum==n)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}