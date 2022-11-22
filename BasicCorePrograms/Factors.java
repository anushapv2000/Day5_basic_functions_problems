package BasicCorePrograms;

import java.util.Scanner;

public class Factors {
 public static void main(String[] args)
 {
     Scanner sc =new Scanner(System.in);
     System.out.println("Enter the number");
     int no=sc.nextInt();

     for (int i=2;i<=no;i++)
     {
         if(no%i==0)
         { int c=0;
             //System.out.println(i);
             for (int j=2;j*j<=i;j++)
             {
                 if (i%j==0){
                     c=1;
                 }
             }
             if (c==0){
                 System.out.println("factors = "+i);
             }

         }

     }
 }
}