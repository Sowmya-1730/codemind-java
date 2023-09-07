import java.util.Scanner;
public class Elements
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
        int[] a=new int[2];
        for(int j=0;j<2;j++)
        {
            a[j]=sc.nextInt();
        }
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<a[0] || arr[i]>a[1])
            {
                System.out.print(arr[i]+" ");
                cnt++;
            }
        }
        if(cnt==0)
        {
            System.out.print(-1);
        }
        
    }
}