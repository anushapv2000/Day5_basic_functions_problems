package FunctionalPrograms;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values for a ,b ,c");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Quadratic o=new Quadratic();
        o.findroot(a,b,c);
    }
    public static void findroot(int a,int b,int c){
        double r1=((-b+Math.sqrt(b*b-4*a*c))/(2*a));
        double r2=((-b-Math.sqrt(b*b-4*a*c))/(2*a));
        System.out.println("Root1 "+r1);
        System.out.println("Root2 "+r2);
    }
}
