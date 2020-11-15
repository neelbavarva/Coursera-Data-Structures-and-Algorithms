import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Random rand = new Random();
        //int l = rand.nextInt(19) + 1;
        int L=sc.nextInt();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();;
        }
        System.out.println(minRefills(arr, L));

    }

    public static int minRefills(int arr[], int L){
        int numRefills = 0;
        int currentRefill = 0;
        if(arr[arr.length-1] - arr[arr.length-2] > L){
            return -1;
        }
        while (currentRefill< arr.length-2){
            int lastRefill = currentRefill;
            while(currentRefill<= arr.length-2 && arr[currentRefill+1]- arr[lastRefill] <=L){
                currentRefill++;
            }
            if(currentRefill == lastRefill){
                return -1;
            }
            if(currentRefill<= arr.length-1){
                numRefills++;
            }
        }
        return numRefills;
    }

}