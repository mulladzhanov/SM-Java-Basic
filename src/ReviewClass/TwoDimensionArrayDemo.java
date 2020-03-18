package ReviewClass;

public class TwoDimensionArrayDemo {

	public static void main(String[] args) {
		
		// 1st way of creating 2d-array
		
		int[][] numbers = new int [2][3];
		
		numbers[0][2] = 8;
		numbers[0][0] = 5;
		numbers[1][0] = 9; 
		numbers[0][1] = 6;
		numbers[1][1] = 2;
		numbers[1][2] = 3;
		
		System.out.println();
		
		//2nd way of creating 2d-array
		
		int[][] numbers2 = { {5,6,8} , {9,2,3} };
		
		System.out.println("Get some values from numbers2");
		
		int value = numbers2[1][0];
	
		System.out.println(value);
		
		System.out.println(numbers[1][1]);
		
		// 1d array is married to for loop
		// 2d array is married to nested for loop
		
		
		
		
		for (int row = 0; row < numbers2.length; row++ ) {
			System.out.println("I am in the " +row+" row");
			
			for (int column =0; column < numbers2[row].length; column++) {
				System.out.print("I am in the "+column+" column. ");
				System.out.println("The value is "+numbers2[row][column]);
				
			}
			
			
		}
		
		
	}

}
