import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Random rand = new Random();
        //int l = rand.nextInt(19) + 1;
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a*b/GCD(a,b));

    }

    public static int GCD(int a, int b){
        if(b==0){
            return a;
        } else {
            return GCD(b,a%b);
        }
    }

}