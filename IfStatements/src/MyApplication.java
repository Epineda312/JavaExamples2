
public class MyApplication {
	public static void main(String[] args) {
		/*boolean comparison = 3 < 2; // True
		boolean notEquals = 3 != 4; // True
		boolean equals = 5 == 4; 	// False  One = assigns variable, 
											//Two == Tests equality, 
											//	(If 5 is equal to 5) 
		System.out.println(comparison);
		System.out.println(notEquals);
		System.out.println(equals);
		
		//Example 1
		if(3 != 10) {
			System.out.println("It's True!");
		}
		
		//Example 2
		int amount = 20;
		if(amount == 20) {
			System.out.println("It's True!");
		}
		
		//Example 3 
		int quantity = 20;
		if(quantity < 21) {
			System.out.println("It's True!");
		} else {
			System.out.println("It's False!");
		}
		
		//Example 4
		int sum = 30;
		if(sum < 21) {
			System.out.println("It's True!");
		} else if(sum > 30) {
			System.out.println("It's False!");
		} else {
			System.out.println("None of the above");
		}
		
		//Example 5
		int all = 0;
		while(all < 0) {
			System.out.println("In the loop");
			all++;
		} */
		
		//Example 6
		int supply = 0;
		while(true) {
			System.out.println("In the loop");
			if(supply == 6) {
				break;
			}
			supply++;
			System.out.println("Out of the loop");
		}
	}
}
