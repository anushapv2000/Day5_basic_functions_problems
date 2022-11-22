package BasicCorePrograms;

import java.util.Scanner;

public class Flipcoin {
    public static void main(String[] args)
    {
        System.out.println("enter the number of times to flip coin");
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        double val;int h=0,t=0;
        for (int i=0;i<no;i++){
            val=Math.random();
            if (val<0.5) {
                t = t + 1;
                //System.out.println(val);
            }
            else
                h=h+1;
        }
        double ph=((double)h)/no;
        double pt=((double)t)/no;
       // System.out.println(ph*100);
        System.out.println("Percent of heads="+ph*100);
        System.out.println("Percent of tails="+pt*100);

    }
}
