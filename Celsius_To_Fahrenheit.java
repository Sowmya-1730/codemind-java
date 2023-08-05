import java.util.*;
public class celsiusFahrenheit
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        float f=(c*1.8f)+32;
        System.out.printf("%.2f",f);
    }
}