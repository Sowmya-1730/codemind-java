import java.util.*;
public class Pretty
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=0;
            for(int j=a;j<=b;j++)
            {
                if(j%10==2 || j%10==3 || j%10==9)
                {
                    c++;
                }
            }
            System.out.println(c);
        }
    }
}