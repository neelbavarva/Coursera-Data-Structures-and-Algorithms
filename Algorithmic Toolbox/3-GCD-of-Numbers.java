import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(19) + 1;
        int b = rand.nextInt(19) + 1;
        System.out.println("A is "+ a + " B is " + b);
        int ans = euclidGCD(a,b);
        System.out.println("Ans is " + ans);


    }

    public static int euclidGCD(int a, int b){
        if(b==0){
            return a;
        } else {
            return euclidGCD(b , a%b);
        }
    }
}