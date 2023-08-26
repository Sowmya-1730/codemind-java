import java.util.*;
public class Concatenate
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        String s3=s1+s2;
        char[] charArray = s3.toCharArray();
        Arrays.sort(charArray);
        System.out.println(new String(charArray));
    }
}