package BasicCorePrograms;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three items ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("greatest=" + a);
        } else if (b > c) {
            System.out.println("greatest=" + b);
        } else
            System.out.println("greatest=" + c);
    }
}