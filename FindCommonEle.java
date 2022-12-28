//Find common element in three diffrent array
import java.util.ArrayList;
import java.util.HashSet;
class FindCommonEleArr{
    static ArrayList<Integer> commonEle(int[] arr1, int[] arr2, int[] arr3){
        HashSet<Integer> hs1=new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<Integer>();
        //For First Array
        for(int i=0;i<arr1.length;i++)
        hs1.add(arr1[i]);
        //For Second Array
        for(int i=0;i<arr2.length;i++)
        hs2.add(arr2[i]);
        ArrayList<Integer> result = new ArrayList<Integer>();
            //Finding Common
        for(int i=0;i<arr3.length;i++)
        if(hs1.contains(arr3[i])&&hs2.contains(arr3[i])&&!(result.contains(arr3[i])))
        result.add(arr3[i]);

        return result;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 10, 20, 40, 80};
        int[] arr2 = {6, 7, 20, 80, 100};
        int[] arr3 = {3, 4, 15, 20, 30, 70, 80, 120};
        ArrayList<Integer> result = new ArrayList<Integer>();
        result = commonEle(arr1,arr2,arr3);
        System.out.println(result); 
    }
}