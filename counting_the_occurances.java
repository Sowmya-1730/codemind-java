import java.util.*;
public class Occurances
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        char l=sc.next().charAt(0);
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(l==s.charAt(i))   
            {
                c++;
            }
        }
        if(c==0)
        {
            System.out.println(-1);
        }
        else
        {
            System.out.println(c);
        }
    }
}