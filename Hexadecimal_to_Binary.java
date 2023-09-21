import java.util.Scanner;
public class HexaBinary
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int s1=sc.nextInt();
        for(int i=0;i<s1;i++)
        {
            String s2=sc.next();
            int d=Integer.parseInt(s2,16);
            String k=Integer.toString(d,2);
            if(k.length()%4==0)
            {
                System.out.println(k);
            }
            else
            {
                int z=4-k.length()%4;
                for(int j=0;j<z;j++)
                k='0'+k;
                System.out.println(k);
            }
        }
    }
}