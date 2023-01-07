
//Input :- -2, -3, 4, -1, -2, 1, 5, -3;
//Output : 7;

public class LargestSumSubARR {
 
    static int largestSum(int[] arr){
        int max_sum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum = arr[i];
            for(int j=i+1;j<arr.length;j++)
            {
                sum=sum+arr[j];
                if(max_sum<sum)
                max_sum=sum;
            } 
        }
    return max_sum;
    }
    public static void main(String[] args) {
       
       int[] arr={-2, -3, 4, -1, -2, 1, 5, -3};
       int sum = largestSum(arr);
       System.out.println(sum);
    }
}
