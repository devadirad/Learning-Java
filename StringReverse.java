import java.util.Scanner;

public class StringReverse{
	public static void main(String[] args){
		//get user input for string
		System.out.println("Please enter a string to reverse!");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();

		while(input == null){
			System.out.println("You did not input a string! Try again!");
			input = scan.nextLine();
		}

		char[] arr = input.toCharArray();
		for(int i=arr.length-1; i>=0; i--){
			System.out.print(arr[i]);
		}
		System.out.println();
		return;


	}
}