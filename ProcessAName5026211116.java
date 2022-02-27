import java.util.Scanner;
public class ProcessAName5026211116 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		String fullName = sc.nextLine();
		int a = fullName.indexOf(' ');
		String firstName = fullName.substring(0, a);
		String firstNameInisial = fullName.substring(0, 1);
		String lastName = fullName.substring(a);
		System.out.println("Your first name is: "+ firstName);
		System.out.println("Your last name is: " + lastName);
		System.out.println("Your name is: " + lastName +", " + firstNameInisial + ".");
	}
}