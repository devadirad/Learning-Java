public class Party{

public static void main(String[] args){

	System.out.println("Welcome to the Party program");
	System.out.println("How many people will be attending the party?");
	int headcount = IO.readInt();
	if(headcount==0){
		System.out.println("Please enter a positive number of people attending");
		IO.reportBadInput();
		return;
	}
	
	System.out.println("How many slices of pizza per person?");
	int slicesperhead = IO.readInt();
	
	System.out.println("How many cans of soda per person?");
	int cansperhead = IO.readInt();
	
	System.out.println("What is the cost of one pizza pie?");
	double costperpizza = IO.readDouble();
	
	System.out.println("How many slices are in a pizza pie?");
	int slicesperpizza = IO.readInt();
	if(slicesperpizza==0){
		System.out.println("Please enter a positive number of slices per pie");
		IO.reportBadInput();
		return;
	}
	
	System.out.println("What is the cost of a case of soda?");
	double costpercase = IO.readDouble();
	
	System.out.println("How many cans are in a case of soda?");
	int canspercase = IO.readInt();
	if(canspercase==0){
		System.out.println("Please enter a positive number of cans per case");
		IO.reportBadInput();
		return;
	}

	
	double slices = headcount*slicesperhead;
	double pizza = Math.ceil(slices/slicesperpizza);
	double pizzacost = pizza*costperpizza;
	
	double cans = headcount*cansperhead;
	double cases = Math.ceil(cans/canspercase);
	double sodacost = cases*costpercase;
	
	double totalcost = pizzacost + sodacost;
	

	IO.outputDoubleAnswer(totalcost);



}


}