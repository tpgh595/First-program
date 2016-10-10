import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		test2 test2object = new test2();
		
		System.out.println("What is your age: ");
		int number = scan.nextInt();
		test2object.testAge(number);
			
		}
	}
