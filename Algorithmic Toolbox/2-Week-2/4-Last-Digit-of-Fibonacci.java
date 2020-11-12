import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        //int l = rand.nextInt(19) + 1;
        int l = sc.nextInt();
        int[] arr = new int[l+1];
        arr[0]=0;
        arr[1]=1;
        //System.out.println(l);
        for(int i=2;i<=l;i++){
            arr[i]=arr[i-1]%10 + arr[i-2]%10;
            arr[i]=arr[i]%10;
        }
        System.out.println(arr[l]);

    }

}