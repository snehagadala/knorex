package day1;

public class Solution2 {
	
	    public static void Printthesequence(int a, int b, int n) {
	        int num = 0;
	        for (int i = 0; i < n; i++) {
	            num += (int) Math.pow(2, i) * b;
	            System.out.print((a + num) + " ");
	        }
	        System.out.println();
	    }
	public static void main(String[] args) {
		
		Printthesequence(6, 4, 10); 

	}

}
