import java.util.HashMap;
import java.util.Scanner;

//find the frequency of an Elements array
//Part Of GFG Top 50 Array Question
class FrequencyOfEle{
    static int findFrequency(int[] arr,int key){
        int n=arr.length;
        HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++)
        if(mp.containsKey(arr[i]))
        mp.put(arr[i],mp.get(arr[i])+1);
        else
        mp.put(arr[i],1);

        if(mp.containsKey(key))
        return mp.get(key);
        else
        return 0;
    }
    public static void main(String[] args) {
        int[] arr={1, 1, 2, 2, 2, 2, 3};
        System.out.println("Enter the Element");
        Scanner s = new Scanner(System.in);
        int key= s.nextInt();
        int frequency = findFrequency(arr,key);
        System.out.println("Occurence of element in Array:- "+frequency);
    }
}