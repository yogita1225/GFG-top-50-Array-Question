// find the subarray with given sum if find multiple then return first
////Part Of GFG Top 50 Array Question
import java.util.Scanner;
public class SumSubArray {
    static int[] subArraySum(int[] arr,int sum){
        int n=arr.length;
        int [] index = new int[2];
        int find=0;
        for(int i=0;i<n;i++){
            int arrsum=arr[i];
            int j=i+1; 
            while(j<n){
                arrsum=arrsum+arr[j];
                if(arrsum==sum){
                    index[0]=i;
                    index[1]=j;
                    find =1;
                    break;
                }
                else
                j++;
            }
            if(find!=0)
            break;
        }
        if(find == 0)
        {
        index[0] = -1;
        index[1] = -1;
        }
        return index;
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10, 5};
        System.out.println("enter the sum");
        Scanner s = new Scanner(System.in);
        int sum = s.nextInt(); 
        int [] index = new int[2];
        index = subArraySum(arr,sum);
        if(index[0]==-1)
        System.out.println("There is no such index with Given Sum");
        else
        System.out.println("Found given sum from index "+index[0]+" to "+index[1]);
    }
    
}
