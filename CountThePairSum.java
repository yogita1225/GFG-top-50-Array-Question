import java.util.ArrayList;
import java.util.HashMap;

//Part Of GFG Top 50 Array Question
//count the pair with the given sum
class CountThePairSum{
    static int countThePair(int[] arr,int sum){
        int reuslt = 0;
        int n = arr.length;
        int count=0;
       HashMap<Integer,Integer>mp = new HashMap<Integer,Integer>();

       for(int i =0;i<arr.length;i++)
        if(mp.containsKey(arr[i]))
        mp.put(arr[i],mp.get(arr[i])+1);
        else
        mp.put(arr[i], 1);


        ArrayList<ArrayList<Integer>> resultSet = new ArrayList<ArrayList<Integer>>();
       
        for(int i=0;i<n;i++){
            int temp = sum - arr[i];
            if(mp.get(arr[i])>1)
            mp.put(arr[i],mp.get(arr[i])-1);
            else
            mp.remove(arr[i]);
            ArrayList<Integer> getPair = new ArrayList<Integer>();
            if(mp.containsKey(temp))
            {   getPair.add(arr[i]);
                getPair.add(temp);
                resultSet.add(getPair);
               count+=mp.get(temp);               
            }
        }
        System.out.println(resultSet);
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {10, 12, 10, 15, -1, 7, 6, 5, 4, 2, 1, 1, 1};
        int sum =11;
        int result = countThePair(arr,sum);
        System.out.println(result);
    }
}