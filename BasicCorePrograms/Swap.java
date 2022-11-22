package BasicCorePrograms;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the two number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("a="+a);
        System.out.println("b="+b);
        int temp=0;
        temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping");
        System.out.println("a="+a);
        System.out.println("b="+b);

    }
}

