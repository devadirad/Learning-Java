public class Compress{
	public static void main(String[] args){
		System.out.println("Enter a string to compress");
		String word = IO.readString();

		String buffer = "";
		for (int i = 0; i < word.length(); i++){
			int characterCount = 1;
		    while((i+1)<word.length() && word.charAt(i) == word.charAt(i+1)) {
		             characterCount++;
		             i++;
		             

		         }
		    buffer = buffer + word.charAt(i);
 			System.out.print(word.charAt(i));
			if(characterCount>1){
				String nu = String.valueOf(characterCount);
				buffer = buffer.concat(nu);
			
		}
	}
		IO.outputStringAnswer(buffer);
}




}