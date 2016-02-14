import java.util.Scanner;

public class Palindrome{
	
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		double numLetsDub = Math.ceil(((double)input.length())/2);
		int numLets = (int)numLetsDub;
		String arrLets = input.substring(numLets);
		Boolean palCheck=true;

		input = input.substring(numLets+1);

		for(int j=numLets; j<input.length(); j++){
			if(arrLets[j]!= input.charAt(j)){
				palCheck=false;
			}

		}

		if(palCheck == true){
			System.out.println("This is a palindrome!!");
		}else{
			System.out.println("This is NOT a palindrome!!");
		}

	}

}