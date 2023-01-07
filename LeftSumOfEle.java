
//Left Sum of each element
//Input : - 4  2  1  5  7  6
//Output:-  0  4  6  7  12  19 
public class LeftSumOfEle {
    static int[] leftSum(int[] arr){
        int n= arr.length;
        int sum=0;
        int[] result = new int[n];
        int k=0;        //For result index;
        for(int i=0;i<n;i++)
        {
            result[k]=sum;
            sum=sum+arr[i];
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
        int [] result = leftSum(arr);
        printArr(result);
    }
}
