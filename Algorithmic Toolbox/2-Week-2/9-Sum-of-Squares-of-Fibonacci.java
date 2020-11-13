import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        //int l = rand.nextInt(19) + 1;
        long l =sc.nextLong();
        long count = 1;
        long a = 0;
        long b = 1;
        long c = 1;
        for(int i=1;i<=l-1;i++){
            c = (a + b)%10;
            a=b;
            b=c;
            count = (count + (c*c)%10)%10;
        }
        System.out.println(count);

    }

}