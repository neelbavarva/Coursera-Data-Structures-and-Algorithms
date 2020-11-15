import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cap = sc.nextInt();
        int[] value = new int[n];
        int[] weight = new int[n];
        double[] ratio =new double[n];
        double loot = 0;
        for(int i=0;i<n;i++){
            value[i]=sc.nextInt();
            weight[i]=sc.nextInt();
            ratio[i]=(double)value[i]/weight[i];
        }

        while(cap>0){
            double max=0;
            int j=0;
            for(int i=0;i<n;i++){
                if(max<ratio[i]){
                    max=ratio[i];
                    j=i;
                }
            }
            if(weight[j] > cap){
                loot = loot + cap*ratio[j];
                cap = 0;
                break;
            } else {
                loot = loot + value[j];
                cap = cap - weight[j];
                ratio[j] = 0;
            }
        }
        System.out.println(loot);

    }
}

// ****** Optimal Way ****** //

// Use Hash-Map to store ratio and index ,
// sort according to ratio.