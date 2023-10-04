import java.util.Scanner;
public class NumberBit
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int x=0;
        for(int i=0;i<t;i++)
        {
           String statement=sc.next();
           if(statement.equals("X++") || statement.equals("++X"))
           {
               x++;
           }
           if(statement.equals("X--") || statement.equals("--X"))
           {
               x--;
           }
        }
        System.out.print(x);
    }
}
