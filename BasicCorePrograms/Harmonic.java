package BasicCorePrograms;

import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter N value");
        int N=sc.nextInt();
        double sum=0.0;
        if (N!=0)
        {
            for (int i=1;i<=N;i++)
            {
                sum=sum+(double)(1/i);
            }
            System.out.println("Nth Harmonic Value="+sum);
        }
        else
            System.out.println("N value is 0");
    }
}
