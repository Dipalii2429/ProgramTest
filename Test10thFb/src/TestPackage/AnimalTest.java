package TestPackage;
import java.util.Scanner;



public class AnimalTest {

		public static void main(String[] args) {

			Animal a;
			Scanner s = new Scanner(System.in);
			System.out.println("1.Dog \n2.Cat \n3.Horse");
			System.out.print("Enter your choice: ");
			int choice = s.nextInt();
			switch (choice) {
			case 1:
				a = new Dog();
				a.shout();
				break;
			case 2:
				a = new Cat();
				a.shout();
				break;
			case 3:
				a = new Horse();
				a.shout();
				break;
			default:
				System.out.print("Invalid input");
			}
		}

	}

