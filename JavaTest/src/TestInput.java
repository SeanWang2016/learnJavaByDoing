import java.util.Scanner;
public class TestInput {
	public static void main (String[] args) {
		int myAge;
		double myWage;
		String myName;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is y our name?");
		myName=keyboard.nextLine();
		System.out.println("Hi "+myName+", How old are you?");
		myAge=keyboard.nextInt();
		if (myAge <16){
			System.out.println("You cannot drive!");
		}
		else if (myAge<18){
			System.out.println("You cannot vote!");
		}
		else if (myAge<25){
			System.out.println("You cannot rent a car!");
		}
		else {
			System.out.println("You can do anything!");
		}
		
		
		
	}

}
