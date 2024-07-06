public class minCost {

    static int mincost(int[] arr, int n, int i){
        int min1 =0;
        int min2 =0;
        // base case
        if(i == n-1){
            return 0;
        }
        // recursion work
        min1 += Math.abs(arr[i]-arr[i+1])+mincost(arr, n, i+1);
        if(i == n-2) return min1;
         min2 += Math.abs(arr[i]-arr[i+1])+mincost(arr, n, i+2);

        return Math.min(min1, min2);
    }
    public static void main(String[] args){
        int[] arr = {10, 30, 40, 20};
        System.out.println("Min Cost : "+mincost(arr, arr.length, 0));
    }
}
