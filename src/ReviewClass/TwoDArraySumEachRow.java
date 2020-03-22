package ReviewClass;

public class TwoDArraySumEachRow {

	public static void main(String[] args) {
		
		// PRINTING THE SUM OF EACH ROW
		
		int[][] nums= { {7,1,6,12}, {9,6,2,8}, {3,15,8,5} };
		
		int[] sum = new int[nums.length];
		
		for (int row=0; row<nums.length; row++) {
			for (int col=0; col<nums[row].length; col++) {
				
				sum[row] = sum[row]+nums[row][col];
						
					
		} 
				
			} for (int a:sum) {
				
				System.out.println(a);
			}	
					
		
		
		
		
		
		

	}

}
