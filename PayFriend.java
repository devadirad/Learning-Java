public class PayFriend{

	public static void main(String[] args){
	
		System.out.println("Thank you for choosing PayFriend");
		System.out.println("Please enter your payment amount to get your processing fee");
		
		double payment = IO.readDouble();
		double fee = 0;
		
		if(payment<0){
			System.out.println("Please enter a positive value");
			IO.reportBadInput();
			return;
		}
		
		if(payment==0){
			fee = 0;
		}
		
		else if(payment<=100){
			fee = 5;
		}
		
		else if(payment<1000){
		
			if(payment*.03> 6){
				fee = payment*.03;
			}
			else{
				fee = 6;
			}
					
		}
		
		else if(payment<10000){
		
			if(payment*.01> 15){
				fee = payment*.01;
			}
			else{
				fee = 15;
			}
			
		}
			
		else if(payment==10000){
			fee = .01*payment;
		}
		
		else if(payment<=15000){
			fee = 10000*.01 + (payment - 10000)*.02;
		}
		
		else if(payment>15000){
			fee = 10000*.01 + 5000*.02 + (payment - 15000)*.03;
		}
		
		
			IO.outputDoubleAnswer(fee);
	
	
	}
}