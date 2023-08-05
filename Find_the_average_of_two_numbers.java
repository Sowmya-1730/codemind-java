import java.util.*;
public class Average
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        float avg;
        avg = (float)(a+b)/2;
        System.out.printf("%.4f",avg);
    }
}