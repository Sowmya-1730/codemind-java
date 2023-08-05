import java.util.*;
public class Temperature
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        float f=(float)32+(c*1.8f);
        System.out.printf("%.2f",f);
    }
}