//Leet Code : one plus;
//Input : [1,2,3];
//Output: [1,2,4];
public class PlusOne {
    static int[] plusOne(int[] digits){
      StringBuffer sb = new StringBuffer();
      for(int i=0;i<digits.length;i++)
      sb.append(String.valueOf(digits[i]));
      for(int i = sb.length()-1;i>=0;i--){
           
            if(sb.charAt(i)!='9'){
                int num = (int)(sb.charAt(i)-48)+1;
                sb.replace(i,  i+1,String.valueOf(num));
                break;
                
            }
            else if(i==0&&sb.charAt(i)=='9'){
                sb.replace(i, i+1, String.valueOf(10));

            }
            else {
                sb.replace(i, i+1, String.valueOf(0));
            }
      }
      int[] result = new int[sb.length()];
      for(int i=0;i<sb.length();i++)
      result[i] = Integer.parseInt(String.valueOf(sb.charAt(i)));
      return result;

    }
    public static void main(String[] args) {
        int [] arr={9,9};
        int[] result = plusOne(arr); 
        for(int i = 0;i<result.length;i++)
        System.out.print(result[i]+"   ");
    }
}
