import java.util.*;
public class Maximum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=0;
        int r;
        while(n!=0)
        {
            r=n%10;
            if(max<r)
            {
                max=r;
            }
            n=n/10;
        }
        System.out.println(max);
    }
}