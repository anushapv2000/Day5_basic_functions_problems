package FunctionalPrograms;

import java.util.Scanner;

public class DArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and cols");
        int m = sc.nextInt();
        int n = sc.nextInt();
        DArray obj=new DArray();
        obj.insertvaluesint(m,n);
        obj.insertvaluesdouble(m,n);
        obj.insertvaluesboolean(m,n);
    }
    public void insertvaluesboolean(int m,int n) {
        boolean a[][] = new boolean[m][n];
        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the boolean values in array");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                a[i][j] = sc.nextBoolean();
            }
        }
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }

    }

    public void insertvaluesdouble(int m,int n) {
        double a[][] = new double[m][n];
        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the double values in array");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                a[i][j] = sc.nextDouble();
            }
        }
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }

    }

    public void insertvaluesint(int m,int n) {
        int a[][] = new int[m][n];
        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the int values in array");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
    }

