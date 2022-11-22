package BasicCorePrograms;

public class Powerof2 {
    public static void main(String[] args){
        int N = Integer.parseInt(args[0]);
        if(N>=0 && N<31){
            for (int i=0;i<=N;i++){
                int tables=(int)Math.pow(2,i);
                System.out.println("2^"+i+"="+tables);
            }
        }
        else
            System.out.println("N value exceeded");
    }
}
