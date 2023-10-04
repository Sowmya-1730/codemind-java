import java.util.Scanner;
public class EvenCountDigit
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int evenCount=0;
        for(int i=0;i<n;i++)
        {
            int q=arr[i];
            int r,cnt=0;
            while(q!=0)
            {
                r=q%10;
                cnt++;
                q=q/10;
            }
            if(cnt%2==0)
            {
                evenCount++;
            }
        }
        System.out.print(evenCount);
    }
}