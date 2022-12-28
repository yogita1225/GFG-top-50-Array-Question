import java.util.ArrayList;

// find peek element which is greater than its neibour
//Part Of GFG Top 50 Array Question
class PeekEleArray {
    static ArrayList<Integer> findPeekEle(int[] arr){
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i=1;i<arr.length-1;i++)
        if(arr[i-1]<arr[i]&&arr[i]>arr[i+1])
        al.add(arr[i]);
        return al;
    }
    public static void main(String[] args) {
        int [] arr={0, 20, 15, 2, 23, 90, 67};
       System.out.println(findPeekEle(arr));
    }
    
}
