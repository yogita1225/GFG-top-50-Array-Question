////Part Of GFG Top 50 Array Question
public class ReverseOfArray {
    static int[] reverseOfArray(int[] arr){
        for(int i=0,j=arr.length-1;i<j;i++,j--)
        { 
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
       int[] reversearr = reverseOfArray(arr);
       for(int i =0 ;i<reversearr.length;i++)
       System.out.print(reversearr[i]+"  ");
    }
    
}
