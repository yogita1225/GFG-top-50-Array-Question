//Find Element whre it's Right suide sum is Equal to left Side Sum if not find return -1;
// Input = 5, 3, -1, 4, 6, 1
//Ouput = 4;
public class FindEleRightLeftSumEqual {
    static int findeleRightLeftSumEqual(int[] arr){
        int n = arr.length;
        int right_sum =0 , left_sum = 0;
        //RIght side sum
        for(int i=0;i<n;i++)
        right_sum=right_sum+arr[i];
        //compare left with right
        for(int i=0;i<n;i++){
            right_sum = right_sum - arr[i];
            if(right_sum==left_sum)
            return arr[i];
            else
            left_sum=left_sum+arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {5, 3, -1, 4, 6, 1};
        int result = findeleRightLeftSumEqual(arr);
        System.out.println(result);
    }
}
