import java.util.Scanner;
public class Exercise1 
{
       public static void main(String[] args)
       {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();  		
		int x = 0;
        while (n != 1) 
        {
            if (n % 5 == 0) 
            {
                n /= 5;
            } 
            else if (n % 3 == 0) 
            {
                n /= 3;
            }
            else if (n % 2 == 0) 
            {
                n /= 2;
            } 
            else 
            {
                System.out.println("Not Ugly Number");
				x = 1;
				break;
            }
        }
        if (x==0)
		System.out.println("Ugly Number");
	    }
}
