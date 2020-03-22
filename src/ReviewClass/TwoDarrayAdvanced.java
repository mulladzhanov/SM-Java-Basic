package ReviewClass;

public class TwoDarrayAdvanced {

	public static void main(String[] args) {
		
		int[][] nums= { {7,1,6,12}, {9,6,2,8}, {3,15,8,5} };
		
		int l=0;
		int s=nums[0][0];
		
		for (int[] row:nums) {
			for (int col:row) {
				

				 if (col>l) {
					 l=col;
				 } 
				  if (col<s) { 
					  s=col;
				  }
				
			}
			
		} System.out.println(s+" "+l);

	
	
	
	
	
	
	
	
	
	
	
	}

}
