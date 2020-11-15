import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        //int l = rand.nextInt(19) + 1;
        long l =sc.nextLong();
        long m = sc.nextLong();

        long period = getPeriod(m);
        //System.out.println(period);
        long f = l%period;
        long[] arr = new long[(int)f+1];
        arr[0]=0;
        arr[1]=1;
        for(int i=1;i<=f-1;i++){
            arr[i+1]=(arr[i]%m+arr[i-1]%m)%m;
        }
        System.out.println(+arr[(int)(f)]%m);

    }

    public static long getPeriod(long m){
        long a=0, b=1, c=a+b;
        for(int i=0;i<m*m;i++){
            c=(a+b)%m;
            a=b;
            b=c;
            if(a==0 && b==1){
                return i+1;
            }
        }
        return 0;
    }

}