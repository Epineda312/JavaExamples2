
public class MyApplication {
	public static void main(String[] args) {
		
		//Example of a One dimensional array
		int[] oneDimensionalArray = {12, 49, 922};
		System.out.println(oneDimensionalArray[1]);
		
		//Example of a multidimensional array
		int[][] multiDimensionalArray = {{12, 49, 922}, {23, 56, 78, 12}, {12, 34, 56,}};
		System.out.println(multiDimensionalArray[1][3]);
		System.out.println(multiDimensionalArray[2][1]);
		
		double [][] Doublearray = new double[4][2];
		
		Doublearray[3][1] = 2.6;
		System.out.println(Doublearray[3][1]);
		
		//How to iterate through a multidimensional array
		for(int array=0; array<multiDimensionalArray.length; array++) {
			for(int item=0; item<multiDimensionalArray[array].length; item++) {
				System.out.print(multiDimensionalArray[array][item] + "\t");
			}
			System.out.println();
		}
				
	}
}
