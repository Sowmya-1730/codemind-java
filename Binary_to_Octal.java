import java.util.*;
public class Conversions
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            String b,c;
            b=sc.next();
            int d=Integer.parseInt(b,2);
            c=Integer.toString(d,8);
            System.out.println(c);
        }
    }
}