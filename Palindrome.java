import java.util.*;
public class Palindrome
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int q=n;
        int r,res=0;
        while(q!=0)
        {
            r=q%10;
            res=res*10+r;
            q=q/10;
        }
        if(res==n)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}