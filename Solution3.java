package day1;

public class Solution3 {

	public static void main(String[] args) {
		
      int[] array = {1,2,6,8};
      int t= 17;
      int length = array.length;
      int sum =0 ;
      for(int i=0;i<length;i++)
      {
    	  sum = sum +array[i];
      }
      System.out.println(sum);
	
    if(sum ==  t)
    {
    System.out.println("true");	
    }
    else
    {
    	System.out.println("false");
    }
}
}