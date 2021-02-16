import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];

        String line = br.readLine();
        String[] strs = line.trim().split(" ");
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(strs[i]);
        }

        int max1 = arr[0];
        for(int i=1;i<n;i++){
            if(max1<arr[i]){
                max1 = arr[i];
            }
        }

        int max2 = 0;
        for(int i=0;i<n;i++){
            if(max2<arr[i] && arr[i]<max1){
                max2 = arr[i];
            }
        }

        System.out.println(max1*max2);
    }
}
