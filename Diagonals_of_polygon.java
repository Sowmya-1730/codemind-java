import java.util.*;
public class Diagonals
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=n*(n-3)/2;
        System.out.printf("%d",d);
    }
}