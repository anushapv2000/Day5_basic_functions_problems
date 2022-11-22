package FunctionalPrograms;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values for t and v");
        double t = Double.parseDouble(args[0]);
        double v = Double.parseDouble(args[1]);
        System.out.println("wind chill");
        WindChill obj=new WindChill();
        obj.compute(t,v);
    }
    public static void compute(double t,double v){
        double w = 0.0;
        if (t < 50 && v < 120 && v > 3) {
            w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * (Math.pow(v, 0.16));
            System.out.println("Value is "+w);
        }
        else {
            System.out.println("not in range");
        }

    }
}