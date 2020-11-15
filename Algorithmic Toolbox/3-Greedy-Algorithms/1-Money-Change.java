import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        //int l = rand.nextInt(19) + 1;
        int n =sc.nextInt();
        System.out.println(getCount(n));
    }

    public static int getCount(int n){
        int amt_10 = n/10;
        int amt_5 = (n - amt_10*10)/5;
        int amt_1 = (n - amt_10*10 - amt_5*5)/1;
        return amt_1+amt_5+amt_10;
    }

}