import java.util.Scanner;

//Move Negative element on one side either left or right ask user for this choice 
////Part Of GFG Top 50 Array Question
public class MoveNeg {
    static int[] moveNeg(int[] arr,String side){
        int n=arr.length;
        int[] result = new int[n];
        int negele=0;           //count of negative Element
      
        for(int i=0;i<n;i++)
        if(arr[i]<0)
        negele++;

        int pos=0;
        int neg=0;

        if(side.equals("right")||side.equals("Right"))
        neg=n-negele;         //start with positive element
        else if(side.equals("left")||side.equals("Left"))
        pos=negele;             //start with negative element
        else{
            System.out.println("Invalid input of side");
            return null;
        }
        
        for(int i=0;i<n;i++){
            if(arr[i]>0)
            {
                result[pos]=arr[i];
                pos++;
            }
            else{
                result[neg]=arr[i];
                neg++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr={-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int[] result = new int[arr.length];
        Scanner s =new Scanner(System.in);
        // choose place of neg either move on right or left
        System.out.println("Where to neg right or left");
        String side=s.nextLine();
        result = moveNeg(arr,side);
        if(result!=null){
        for(int i=0;i<result.length;i++)
        System.out.print(result[i]+"   ");
        }
        
    }
    
}
