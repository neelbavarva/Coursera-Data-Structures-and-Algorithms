import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {
        Random rand = new Random();
        int l = rand.nextInt(19) + 1;
        int[] arr = new int[l];
        arr[0]=0;
        arr[1]=1;
        System.out.println("Random number "+l);
        for(int i=1;i<l-1;i++){
            arr[i+1]=arr[i]+arr[i-1];
        }
        System.out.println("Fibonacci "+arr[l-1]);
    }
}