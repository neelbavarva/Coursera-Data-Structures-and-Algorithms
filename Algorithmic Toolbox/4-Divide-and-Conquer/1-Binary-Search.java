import java.util.*;

public class HelloWorld {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        mergeSort(arr, 0 , arr.length-1);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int num = sc.nextInt();
            System.out.print(binarySearch(arr, 0 , arr.length -1, num ) + " ");
        }
    }

    public static int binarySearch(int arr[], int l , int r, int x){
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not present
        // in array
        return -1;
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