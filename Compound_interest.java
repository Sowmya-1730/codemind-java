import java.util.*;
public class Compoundinterest
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double p=sc.nextInt();
        double r=sc.nextInt();
        double t=sc.nextInt();
        double ci;
        ci = p*(Math.pow((1 + r / 100), t));
        System.out.printf("%.2f",ci);
    }
}