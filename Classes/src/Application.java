
class Methods{
	
	String animal;
	int value;
	int month;
	
	void run() {
		
		System.out.println("Running");
		for(int i=0; i<4; i++) {
		System.out.println("My " + animal + " is " + value + " years old.");
		}
	}
	
	int calculateMonthsToBirthday() {
		int monthsLeft = 12 - month;
		return monthsLeft;
	}
	
	void talk(String text) {
		System.out.println(text);
	}
	
	void walk(int speed) {
		System.out.println("Walking " + speed + " km per hour");
	}
	
	void timer(int minutes, double seconds) {
		System.out.println("It took " + minutes + "m and " + seconds + "s to get down the hill.");
	}
}


public class Application {
 
	public static void main(String [] args) {
		
		Methods name = new Methods();
		name.animal = "Cat";
		name.value = 9;
		//name.run();
		name.month = 8;
		int months = name.calculateMonthsToBirthday();
		name.talk("Hi, I am Steven!");
		name.walk(10);
		String hello = "Hello there";
		name.timer(10,3.64);
		name.talk(hello);
		
		System.out.println("Months until birthday " + months);
		
	}
}
