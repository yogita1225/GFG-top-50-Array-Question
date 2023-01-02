//Question 2(GFG Top 50 Question) :- Minimum and maximum of array 
public class MinMaxArray {
    static int[] findMinMax(int[] arr){
        int [] result = new int[2];
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i])
            max=arr[i];
            if(min>arr[i])
            min = arr[i];
        }
        result[0]=min;
        result[1]=max;
        return result;
    }
    public static void main(String[] args) {
        int[] arr={3, 2, 1, 56, 10000, 167};
        int[] arr2= new int[2];
        arr2 = findMinMax(arr);
        System.out.println("Minimum value:- "+arr2[0]+"\nMaximum value:- "+arr2[1]);
    }
    
}
