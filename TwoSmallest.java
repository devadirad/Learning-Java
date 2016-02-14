public class TwoSmallest{
public static void main(String[] args){

	System.out.println("Enter your terminating value");
	double terminate = IO.readDouble();
	double temp = terminate + 1;
	double smallest;
	double smallest2;
	
	System.out.println("Enter a number");
	smallest = IO.readDouble();
	if(smallest==terminate){
		IO.reportBadInput();
		return;
	}
	
	System.out.println("Enter a number");
	smallest2 = IO.readDouble();
	
	if(smallest2==terminate){
		IO.reportBadInput();
		return;
	}
	
	if(smallest2<smallest){
		double temps = smallest;
		smallest = smallest2;
		smallest2 = temps;
	}

	System.out.println("Enter a number");
	temp = IO.readDouble();
	
	while(temp!=terminate){
		

		
		if(temp<=smallest){
		smallest2 = smallest;
		smallest = temp;
		}
		
		else if(temp<=smallest2){
		smallest2 = temp;
		}
		
		System.out.println("Enter a number");
		temp = IO.readDouble();
	
		}
	
	IO.outputDoubleAnswer(smallest);
	IO.outputDoubleAnswer(smallest2);

}
}