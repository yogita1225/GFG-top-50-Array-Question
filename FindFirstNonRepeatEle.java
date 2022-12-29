import java.util.ArrayList;

class FindFirstNonRepeatEle{
    static int firstNonRepeatEle(int[] arr){
        int n = arr.length;
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i =0;i<n;i++)
        al.add(arr[i]);
        //Checking the duplicate in array

        for(int i=0;i<n;i++){
            al.remove(0);
            if(!(al.contains(arr[i])))
            return arr[i];
            else    
            al.add(arr[i]);     //if not then add the duplicate ele again in arraylist
        }
        return 0;
        
    }
    public static void main(String[] args) {
        int[] arr = {9, 4, 9, 6, 7, 4};
        int result = firstNonRepeatEle(arr);
        System.out.println(result);
    }
}