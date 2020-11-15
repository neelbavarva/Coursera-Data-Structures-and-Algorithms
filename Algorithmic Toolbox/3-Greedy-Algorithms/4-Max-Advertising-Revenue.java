import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        //int l = rand.nextInt(19) + 1;
        int n =sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            b[i] = sc.nextInt();
        }
        System.out.println(getAns(a,b));
    }

    public static int getAns(int[] a,int[] b){
        Arrays.sort(a);
        Arrays.sort(b);
        int count =0;
        for (int i=0;i<a.length;i++){
            count = count + a[i]*b[i];
        }
        return count;
    }

}