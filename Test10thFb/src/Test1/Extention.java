package Test1;

import java.util.*;

public class Extention {

	private String firstName, lastName;

	public void Employee(String fName, String lName) throws Exception {
		firstName = fName;
		lastName = lName;
		validate();
	}

	public void validate() throws Exception {
		if (firstName.equals("") || lastName.equals("")) {
			throw new NullPointerException("Entry missing");
		}

		if (firstName.length() < 3 || lastName.length() < 3) {
			throw new MinimumCharacterException();
		}
		System.out.print("Entered data is correct.");
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Enter the first name: ");
		String fName = s.next();
		System.out.print("Enter the last name: ");
		String lName = s.next();
		try {
			Employee emp = new Employee(fName, lName);
		} catch (Exception e) {
			System.out.print(e);
		}
	}

}
