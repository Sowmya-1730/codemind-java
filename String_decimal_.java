import java.util.Scanner;
public class StringDecimal
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            String digit=sc.next();
            int cnt=0;
            int l=0;
            for(int j=0;j<digit.length();j++)
            {
                if(Character.isDigit(digit.charAt(j)))
                {
                    cnt++;
                }
                l++;
            }
            if(cnt==l)
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
        }
    }
}