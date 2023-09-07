import java.util.*;
public class wavecount
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
        int cnt=0;
        for(int i=0;i<n-1;i++)
        {
            if(arr[0]<arr[1])
            {
                if(i%2==0)
                {
                    if(arr[i]<arr[i+1])
                    {
                        cnt++;
                    }
                }
                else
                {
                    if(arr[i]>arr[i+1])
                    {
                        cnt++;
                    }
                }
            }
            else
            {
                if(i%2==0)
                {
                    if(arr[i]>arr[i+1])
                    {
                        cnt++;
                    }
                }
                else
                {
                    if(arr[i]<arr[i+1])
                    {
                        cnt++;
                    }
                }
            }
        }
        if(cnt==n-1)
        {
            System.out.print(cnt/2);
        }
        else
        {
            System.out.print("-1");
        }
    }
}