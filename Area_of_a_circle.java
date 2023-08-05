import java.util.Scanner;
public class Areaofcircle
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int r;
        float area;
        r=sc.nextInt();
        area=3.14F*r*r;
        System.out.printf("%.2f",area);
    }
}