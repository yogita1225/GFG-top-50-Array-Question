import java.util.ArrayList;
//LeetCode Question
public class PaskalTriangel2 {
    static ArrayList<Integer> paskalTriangle(int rowIndex){
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(1);
        if(rowIndex==0)
        return result;
        else{  
            while(result.size()<=rowIndex){
         ArrayList<Integer> al = new ArrayList<>();
          int i =1;
          al.add(1);
          while(i<result.size()){
              al.add(result.get(i)+result.get(i-1));
              i++;
          }
            al.add(1);
            result = al;
        }
    }
    return result;
    }
    public static void main(String[] args) {
        int row = 3;
        ArrayList<Integer> result = new ArrayList<>();
        result = paskalTriangle(row);
        System.out.println(result);
    }
}
