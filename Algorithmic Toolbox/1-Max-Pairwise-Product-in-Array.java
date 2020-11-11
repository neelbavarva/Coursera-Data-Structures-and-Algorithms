import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {
        Random rand = new Random();
        while (true) {
            int l = rand.nextInt(9) + 1;
            int[] arr = new int[l];
            System.out.println(l);
            for (int i = 0; i < l; i++) {
                arr[i] = rand.nextInt(14) + 1;
            }

            int ans = maxProduct(arr);
            int ansFast = maxProductFast(arr);
            if(ansFast == ans){
                for(int i=0;i< arr.length;i++){
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
                System.out.println("Slow " + ans + " Fast " + ansFast );
                System.out.println("Ok");
            } else {
                for(int i=0;i< arr.length;i++){
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
                System.out.println("Slow " + ans + " Fast " + ansFast );
                System.out.println("NOOOOOOO");
                break;
            }
        }
    }


    public static int maxProduct(int arr[]) {
        int product = 0;
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(product < arr[i]*arr[j]){
                    product = arr[i]*arr[j];
                }
            }
        }
        return product;
    }

    public static int maxProductFast(int arr[]) {
        int product = 0;
        int max1=0;
        int max2=0;
        int k = 0;
        for(int i=0;i< arr.length;i++){
            if(max1<arr[i]){

                max1=arr[i];
                k=i;

            }
        }
        System.out.println("Class" + max1);
        for(int i=0;i< arr.length;i++){
            if((max2<arr[i]) &&  k!=i){

                max2=arr[i];

            } else {
                continue;
            }
        }
        System.out.println("Class" + max2);
        product = max1*max2;
        return product;
    }
}