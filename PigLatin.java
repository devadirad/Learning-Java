import java.util.Scanner;
import java.util.StringTokenizer;

public class PigLatin{

static Boolean startsWithVowel(String word){
	if(word.startsWith("a") || word.startsWith("e") || word.startsWith("i") || word.startsWith("o") || word.startsWith("u") || word.startsWith("y")){
		return true;
	}else{
		return false;
	}
}

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a word or sentence to convert to Pig Latin!");
		String input = scan.nextLine();
		String output = "";

		while(input == null){
			input = scan.nextLine();
		}

		StringTokenizer st = new StringTokenizer(input);

		while(st.hasMoreTokens()){
			String temp = st.nextToken();
			if(Character.isDigit(temp.charAt(0))){
				output = output.concat(temp);
				if(st.hasMoreTokens()){
					output = output.concat(" ");
				}
			}
			else{
				if(startsWithVowel(temp)){
					output = output.concat(temp);
					output = output.concat("yay");
				}
				else{
					output = output.concat(temp.substring(1));
					output = output.concat(temp.substring(0,1));
					output = output.concat("ay");
				}
				if (st.hasMoreTokens()){
					output = output.concat(" ");
				}
			}
		}

		System.out.println(output);

	}
}