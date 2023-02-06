//Leet Code Question: - Shuffle The array
//


public class SuffleTheArray {
    static int[] suffel(int[] nums,int n){
        int[] result = new int[nums.length];
        int x = 0,y=n ;
      
      for(int i=0;i<result.length;i++){
         
          if(i==0&&x<n)
          {
              result[i]=nums[x];
              x++;
             
          }
          else if(i%2==0&&x<n)
          {
              result[i]=nums[x];
              x++;
            
          }
          else if(i%2!=0&&y<2*n)
          {
              result[i]=nums[y];
              y++;
              
          }
          
        } 
        return result;
    }
    public static void main(String[] args) {
        int[] arr={2,5,1,3,4,7};
        int[]result = suffel(arr,arr.length/2);
        for(int i=0;i<result.length;i++)
        System.out.print(result[i]+"   ");
    }
}
