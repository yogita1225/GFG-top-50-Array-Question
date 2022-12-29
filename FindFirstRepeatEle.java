import java.util.ArrayList;
import java.util.HashMap;
//find the first ele which is duplicate in array
public class FindFirstRepeatEle {
    static int FindFirstRepeat(int[] arr){
        HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>();

        for(int i=0;i<arr.length;i++)
        if(mp.containsKey(arr[i]))
        mp.put(arr[i],mp.get(arr[i])+1);
        else
        mp.put(arr[i],1);
        
        for(int i=0;i<arr.length;i++)
        if(mp.get(arr[i])>1)
        return arr[i];
        return -1;
    }
    public static void main(String[] args) {
        int [] arr= {6, 10, 5, 4, 9, 120, 4, 6, 10};
        int result = FindFirstRepeat(arr);
        System.out.println(result );
    }
    
}
