package day1;

public class Solution4 {

		public void printPrisonerToWarn(int n, int m, int s) {
	        int lastPrisoner = s;
	        for (int i = 1; i <= m; i++) {
	            lastPrisoner = (lastPrisoner % n) + 1; 
	        }
	        System.out.println(lastPrisoner);
	    }

	    public static void main(String[] args) {
	        Solution4 jailCandyDistribution = new Solution4();
	        
	        jailCandyDistribution.printPrisonerToWarn(5, 2, 1); 
	}

}
