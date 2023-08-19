import java.util.*;
public class Obinary
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            String octal=sc.next();
            int dec=Integer.parseInt(octal,8);
            System.out.println(Integer.toBinaryString(dec));
        }
    }
}