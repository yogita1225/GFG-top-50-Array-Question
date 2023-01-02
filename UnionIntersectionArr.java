//union and intersection of two sorted  array
//Part Of GFG Top 50 Array Question
import java.util.ArrayList;
public class UnionIntersectionArr {
    static void unionIntersection(int[]arr1,int[] arr2){
        int n1 = arr1.length;
        int n2 = arr2.length;
        ArrayList<Integer> union = new ArrayList<Integer>();
        ArrayList<Integer> intersection = new ArrayList<Integer>();

        int i=0,j=0;
        while(i<n1&&j<n2){
            if(arr1[i]<arr2[j]){
                union.add(arr1[i]);
                i++;
            }
            else if(arr1[i]>arr2[j]){
                union.add(arr2[j]);
                j++;
            }
            else{
                union.add(arr1[i]);
                intersection.add(arr2[j]);
                i++;
                j++;
            }
        }
        while(i<n1){
            union.add(arr1[i]);
            i++;
        }
        while(j<n2){
            union.add(arr2[j]);
            j++;
        }
        System.out.println(union);
        System.out.println(intersection);

    }
    public static void main(String[] args) {
        int[] arr1 = {2, 5, 6};
        int[] arr2 = {4, 6, 8, 10};
        unionIntersection(arr1,arr2);

    }
    
}
