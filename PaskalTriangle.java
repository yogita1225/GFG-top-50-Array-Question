import java.util.ArrayList;
//LeetCode Question : = Paskal Triangle
public class PaskalTriangle {
    static ArrayList<ArrayList<Integer>> paskalTriangle(int numRows){
        ArrayList<ArrayList<Integer>> result =  new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> al = new ArrayList<>();

        al.add(1);
        result.add(al);
        if(numRows==1){
            return result;
        }
       
        else {
            int num = 2;
            while(num<=numRows){
                ArrayList<Integer> temp = new ArrayList<>();
                int i=1;
                temp.add(1);
                while(i<al.size()){
                    temp.add(al.get(i)+al.get(i-1));
                    i++;
                }
                temp.add(1);
                result.add(temp);
                al = temp;
                num++;
            }

        }
        return result;

    }
    public static void main(String[] args) {
        int numRows=5;
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

         result = paskalTriangle(numRows);
        System.out.println(result);
    }
}
