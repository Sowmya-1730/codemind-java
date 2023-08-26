import java.util.*;
public class Reverse
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch[]=s.toCharArray();  
        String rev="";  
        for(int i=ch.length-1;i>=0;i--)
        {  
        rev+=ch[i];  
        } 
        System.out.println(rev);
    }
}