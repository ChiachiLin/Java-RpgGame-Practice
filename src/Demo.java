import java.util.InputMismatchException;
import java.util.Scanner;
import Role.*;

public class Demo {

	private static Scanner scanner;
	private static int job = 0;
	private static String name;
	private static int chioce;

	public static void main(String args[]) {
		// Named
		System.out.println("Welcome to Newworld! ");
		System.out.print("What is your name,Adventurer ? ");
		named();
		// Choose job
		System.out.println("Please choose your job! ");
		System.out.println("The folloeing are jobs' information. ");
		System.out.println("[1]SwordsMan HP:100 Atk:10");
		System.out.println("[2]Magician  HP:80  Atk:15");
		chiocejob();
		System.out.print(chioce);
	}

	public static void named() {
		scanner = new Scanner(System.in);
		name = scanner.nextLine();
		System.out.println("Hello!" + name);
	}

	public static int chiocejob() {
		try {
			scanner = new Scanner(System.in);
			System.out.print("Your chioce is ? :");
			job = scanner.nextInt();
			if (job == 1) {
				//SwordsMan chioce = new SwordsMan(name, 100, 1, 10);
				System.out.println("Congratulations! You become a SwordsMan. ");
				chioce = 1 ;
			} else if (job == 2) {
				//Magician chioce = new Magician(name, 80, 1, 15);
				System.out.println("Congratulations! You become a Magician. ");
				chioce = 2 ;
			} else {
				System.out.println("The chioce is not in the list! please choose again!");
				chiocejob();
			}

		} catch (InputMismatchException e) {
			System.out.printf("Wrong input¡G%s%n", scanner.next());
			System.out.println("Please choose again!");
			chiocejob();
		}
		return chioce;
		

	}

}
