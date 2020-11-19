import java.util.*;

public class HelloWorld {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {6,8,1,5,2,9,4};
        mergeSort(arr, 0 , 6);
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void mergeSort(int[] arr , int l , int r){
        if(l < r){
            // Find the middle point
            int m = (l+r)/2;

            // Sort first and second halves
            mergeSort(arr, l, m);
            mergeSort(arr, m+1, r);

            // Merge the sorted halves
            merge(arr, l , m , r);
        }
    }

    public static void merge(int[] arr, int l, int m, int r){
        // Find sizes of two subarrays to be merged
        int size1 = m-l+1;
        int size2 = r-m;

        /* Create temp arrays */
        int L[] = new int[size1];
        int R[] = new int[size2];

        /*Copy data to temp arrays*/
        for (int i=0; i<size1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<size2; ++j)
            R[j] = arr[m + 1+ j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i=0 , j=0;

        // Initial index of merged subarry array
        int k = l;
        while (i < size1 && j < size2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < size1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < size2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }

    }
}