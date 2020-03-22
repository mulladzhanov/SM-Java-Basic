package ReviewClass;

public class TwoDarray {

	public static void main(String[] args) {
		
		
		int[][] nums= { {7,1,6,12}, {9,6,2,8}, {3,15,8,5} };
		
		int sum=0;
		int l=0;
		int s=nums[0][0];
		
		for (int i=0; i<nums.length; i++) {
						
		 for(int j=0; j<nums[i].length; j++) {
			 
			 if (nums[i][j]>l) {
				 l=nums[i][j];
			 } 
			  if (nums[i][j]<s) { 
				  s=nums[i][j];
			  }
			 
			 System.out.print(nums[i][j]+" ");
			 
			         
					 sum+=nums[i][j];
					 				 
			 
		 }System.out.println();
		
		} System.out.println("The sum of nums is "+sum);
		System.out.println("The largest of nums is "+l);
		System.out.println("The smallest of nums is "+s);
		
	
	
	
	
	
	
	
	}

}
