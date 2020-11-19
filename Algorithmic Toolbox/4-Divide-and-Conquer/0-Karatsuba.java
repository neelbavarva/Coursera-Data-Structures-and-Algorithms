import java.util.*;

public class HelloWorld {

    public static long length(long x){
        int ctr = 0;
        while (x != 0)
        {
            ctr++;
            x /= 10;
        }
        return ctr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.println(karatsuba(a,b));

    }

    public static long karatsuba(long x, long y){

        //Finding length of the numbers
        long l1 = length(x);
        long l2 = length(y);

        long N = Math.max(l1, l2);
        
        //If N is small, no need to apply complex algo
        if(N < 10){
            return x*y;
        }
        
        N = N/2 + N%2;

        long m = (long)Math.pow(10, N);

        long a = x/m;
        long b = y/m;
        long c = x%m;
        long d = y%m;

        long ans = (a * b * (long)Math.pow(10, N*2)) + ((a + c)*(b + d) - a*b - c*d)*m + c*d ;

        return ans;
    }

}