import java.util.*;
public class Gradesofrides
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int hurlfactor=sc.nextInt();
        int spinfactor=sc.nextInt();
        int speedoffactor=sc.nextInt();
        if(hurlfactor>50 && spinfactor>60 && speedoffactor>100)
        {
            System.out.printf("%d",10);
        }
        else if(hurlfactor>50 && spinfactor>60)
        {
            System.out.printf("%d",9);
        }
        else if(spinfactor>60 && speedoffactor>100)
        {
            System.out.printf("%d",8);
        }
        else if(hurlfactor>50 && speedoffactor>100)
        {
            System.out.printf("%d",7);
        }
        else if(hurlfactor>50 || spinfactor>60 || speedoffactor>100)
        {
            System.out.printf("%d",6);
        }
        else
        {
            System.out.printf("%d",5);
        }
    }
}