package FunctionalPrograms;

import java.util.Scanner;

public class Sum3Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, k;

        Sum3Numbers o=new Sum3Numbers();
        o.compute();

    }
    public static int[] insert() {

        int i;
        Scanner sc =new Scanner(System.in);
        // int a[]= {3,-2,4,-1,-2,3,4,-7};
        System.out.println("Enter the size  of array");
        int m = sc.nextInt();
        int a[] = new int[m];
        System.out.println("Enter the values in array");
        for (i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }
        return a;
    }
    public static void compute(){
    int sum=0,c=0,i,j,k;
    int a[]=insert();
    int m=a.length;
    boolean visit[]=new boolean[m];
    for(i=0;i<m;i++){
        for (j=0;j<i;j++)
        {
            for (k=0;k<j;k++) {
                sum = a[i] + a[j] + a[k];
                if (sum == 0) {
                    if (visit[k] == true && visit[j] == true || visit[i]==true )
                    {
                        continue;
                    }
                    else
                    {
                        visit[i] = true;
                        visit[k] = true;
                        visit[j] = true;
                        c = c + 1;
                        System.out.println(a[i] + " " + a[j] + " " + a[k]);
                    }
                }
            }
        }
    }
        System.out.println("number of triplets="+c);



    }
}
