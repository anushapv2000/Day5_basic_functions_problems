package BasicCorePrograms;

import java.util.Scanner;

public class quo_rem {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int no=sc.nextInt();
        for(int i=1;i<=no;i++)
        {
            int rem=no%i;
            int quo=no/i;
            System.out.println("Number "+no+" with "+i+" quotient="+quo+" reminder="+rem);
        }

    }
}
