import java.util.*;
public class Electricity
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String id= sc.nextLine();
        String name= sc.nextLine();
        int uc=sc.nextInt();
        float t;
        if(uc<199)
            t=uc*1.20f;
        else if(uc>=200 && uc<400)
            t=uc*1.50f;
        else if(uc>=400 && uc<600)
            t=uc*1.80f;
        else
            t=uc*2.00f;
        float am;
        if(t>400)
            am=t+((t*15)/100);
        else
            am=t+100;
        System.out.printf("%.2f",am);
    }
}