import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        //int l = rand.nextInt(19) + 1;
        long l =sc.nextLong();
        long count = 1;
        int[] arr = new int[(int)l+1];
        arr[0]=0;
        arr[1]=1;
        for(int i=1;i<=l-1;i++){
            arr[i+1]=(arr[i]+arr[i-1])%10;
            count = (count + arr[i+1])%10;
        }
        //System.out.println("Fibonacci "+arr[(int)l-1]);
        System.out.println(count);

    }

}