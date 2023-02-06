import java.util.ArrayList;
import java.util.Stack;
//LeetCode Question:- Number of Students Unable to Eat Lunch 


public class NumberOfStdSand {
    static int numberofStd(int[] students, int[] sandwiches) {
        
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i = sandwiches.length-1;i>=0;i--)
        stack.push(sandwiches[i]);
        
        for(int i = 0 ;i<students.length;i++)
        al.add(students[i]);
        
 
        while(stack.size() == al.size()){
            System.out.println(stack);
            System.out.println(al);
            if(stack.isEmpty()==true)
            return al.size();
            else if(stack.peek()==0&&!(al.contains(0)))
            return al.size();
            else if(stack.peek()==1&&!(al.contains(1)))
            return al.size();
            else if(stack.peek()==al.get(0))
            {
                al.remove(stack.peek());
                stack.pop();
            }
            else{
                al.add(al.get(0));
                al.remove(al.get(0));

            }
            // System.out.println(stack);
            // System.out.println(al);
           
        }
        return 0;
    }
    public static void main(String[] args) {
        int [] students = {0,0,1,1,0,0,0,0,1,0,0,1,1,0,1,1};
        int[] sandwiches = {1,0,0,0,0,0,0,1,0,0,1,0,1,1,1,0};
        int result = numberofStd(students,sandwiches);
        System.out.println(result );
    }
}
