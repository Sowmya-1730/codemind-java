import java.util.*;
public class FahrenheitCelsius
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int f=sc.nextInt();
        float c=(float)((f-32)*5)/9;
        System.out.printf("%.2f",c);
    }
}