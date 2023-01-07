
//Right Sum of each element
//Input : - 4  2  1  5  7  6
//Output:-  21  19  18  13  6  0 
public class RightSumOfEle {
    static int[] rightSum(int[] arr){
        int n = arr.length;
        int [] result = new int [n];
        int k = 0;  //for result array index
        int sum=0;
        //sum of whole array
        for(int i=0;i<n;i++)
        sum=sum+arr[i];
        //sum of each element right side

        for(int i=0;i<n;i++)
        {
            sum=sum-arr[i];
            result[k] = sum;
            k++;
        }
        return result;      
    }
    static void printArr(int[] result){
        for(int i=0;i<result.length;i++)
        System.out.print(result[i]+"   ");
    }
    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 5, 7, 6};
        int [] result = rightSum(arr);
        printArr(result); 
    }
}
