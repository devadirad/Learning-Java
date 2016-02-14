public class WordCount{

		public static void main(String[] args){
			System.out.println("Enter a sentence to count");
			String sentence = IO.readString();
			System.out.println("At least how many letters should each word be");
			int constraint = IO.readInt();
			int letterCount;
			int words = 0;
			
			for (int i = 0; i < sentence.length(); i++){
					letterCount= 0;
				while((i)<sentence.length() && sentence.charAt(i) != ' '){
				
					if(Character.isLetter(sentence.charAt(i))){
						letterCount++;
						i++;
						
					}
					else{
						i++;
					}


			         }
				if(letterCount>=constraint){
					words++;
				
			}
		}
			
			System.out.println("The number of words greater than " + constraint + " letters long are:");
			IO.outputIntAnswer(words);
		
	}

}