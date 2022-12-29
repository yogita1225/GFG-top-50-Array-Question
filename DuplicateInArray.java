//Print all the duplicate element in array or count the number of element
//which are duplicates
//Part Of GFG Top 50 Array Question
import java.util.ArrayList;
import java.util.HashMap;
public class DuplicateInArray {
    static ArrayList<Integer> duplicateInArray(int[] arr){
        ArrayList<Integer> duplicate  = new ArrayList<Integer>();
        HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>();
        for(int i =0;i<arr.length;i++)
        if(mp.containsKey(arr[i]))
        mp.put(arr[i],mp.get(arr[i])+1);
        else
        mp.put(arr[i], 1);

        for(int i=0;i<arr.length;i++)
        if(mp.get(arr[i])>1){
        duplicate.add(arr[i]);
            mp.put(arr[i],1);
            
    }
        if(duplicate.isEmpty())
        duplicate.add(-1);
        return duplicate;
    }
    public static void main(String[] args) {
        int[] arr={2, 3, 1, 2, 3};
        ArrayList<Integer> duplicate  = new ArrayList<Integer>();
        duplicate = duplicateInArray(arr);
        System.out.println(duplicate);
    }
}
