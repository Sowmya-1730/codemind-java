import java.util.Scanner;
public class Slicing
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String sentence=sc.nextLine();
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;i<=b;i++)
        {
            System.out.print(sentence.charAt(i));
        }
    }
}