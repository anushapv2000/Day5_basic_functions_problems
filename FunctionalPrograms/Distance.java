package FunctionalPrograms;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the values for a ,b ,c");
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        Distance obj=new Distance();
        obj.finddist(x,y);

    }
    public static void finddist(int x,int y){

        double dist=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        System.out.println("value is "+dist);
    }
}
