import java.util.*;
public class IP
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String DIP = s.replace(".","[.]");
        System.out.println(DIP);
    }
}