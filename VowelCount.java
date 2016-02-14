//write a program to take an input string and print out the total count of all the vowels found

import java.util.Scanner;

public class VowelCount{

public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	System.out.println("Please enter a string to count vowels!");
	String temp = scan.nextLine();
	int aCount = 0;
	int eCount = 0;
	int iCount = 0;
	int oCount = 0;
	int uCount = 0;

	for(int i=0; i<temp.length(); i++){
		if(temp.charAt(i)=='a'){
			aCount++;
		}else if(temp.charAt(i)=='e'){
			eCount++;
		}else if(temp.charAt(i)=='i'){
			iCount++;
		}else if(temp.charAt(i)=='o'){
			oCount++;
		}else if(temp.charAt(i)=='u'){
			uCount++;
		}
	}

	System.out.println();
	System.out.println();
	System.out.println("     VOWEL COUNT");
	System.out.println("---------------------");
	System.out.println("Input String: "+temp);
	System.out.println("--------------------");
	System.out.println("Number of A's:  "+aCount);
	System.out.println("Number of E's:  "+eCount);
	System.out.println("Number of I's:  "+iCount);
	System.out.println("Number of O's:  "+oCount);
	System.out.println("Number of U's:  "+uCount);

}

}