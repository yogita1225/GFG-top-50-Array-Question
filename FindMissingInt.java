import javax.xml.transform.Source;

//find missing integer in array where array is from [1,N] where N is natral number
////Part Of GFG Top 50 Array Question

public class FindMissingInt {
    static int missingNaturalNum(int[] arr){
        int n = arr.length;
        int n2=n+1;     //Increment because of missing number
        //sum of n natural number
        int mainsum=(n2*(n2+1))/2;
        int sum=0;
        for(int i=0;i<n;i++)
        sum=sum+arr[i];
        return mainsum-sum;
    }
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 5};
        int result = missingNaturalNum(arr);
        System.out.println("Missing Number in Array : - "+result);
    }
    
}
