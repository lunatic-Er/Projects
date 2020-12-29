import java.util.*;
class ATM
{
	//Account Number , Password , Balance decleared!!
	int accNum=1234567890,pass=1122,bal=100000, chance=3;

	//Intializing Scanner
	Scanner i = new Scanner(System.in);	

	//Intialising function to show options
	public void open()
	{
	
		System.out.println("1. Balance Enquiry");
		System.out.println("2. Cash Withdrawal");
		System.out.println("3. Cash Deposite");
		System.out.println("4. Instant pin Generation");
	
	int a=i.nextInt();

	//Switch statement to get users call
	switch(a)
	  {
		case 1 : balEnq();
				break;
		case 2: cashWidrl();
				break;
		case 3: cashDepos();
				break;
		case 4 : pinGen();
				 break;
		default : 
				 System.out.println("Enter Correct Option!!!");
				 open();
				 break;
	  }
	}

	//funtion of User evaluation
	public void evaluation(){
		
		System.out.println("Enter Account Number");
		int acc = i.nextInt();
		
		System.out.println("Enter Your PIN");
        int pin = i.nextInt();

        if(acc==accNum && pin==pass){
        	open();
        }

        else{
        	System.out.println("Invalid Account Number or PIN!! Plesse Try Again...");
        	chance = chance - 1;
        	if(chance==0){
        		System.exit(0);
        	}
        	else{
        		evaluation();
        	}
        }
        	
	}

	//Fuction to Enqire Balance
	public void balEnq(){

		System.out.println("Your Current balance is "+bal);
		rsm();


	}

	//Funtion to Withdrawl Money
	public void cashWidrl(){

		System.out.println("Enter the amount to Withdrawal in the multiples of 100");
		int amt=i.nextInt();

		if(amt%100==0){

			if(bal>=amt){

				bal=bal-amt;
				balEnq();
			}
		else{
			System.out.println("Insufficient funds!!!");
		}

		}

		else{
			System.out.println("Sorry your amount is not a multiple of 100!!");
		}
		rsm();

	}

	//Funtion to Deposite Case
	public void cashDepos(){

		System.out.println("Enter the amount to Deposite in the multiples of 100");
		int amt=i.nextInt();

		if(amt%100==0){

				bal=bal+amt;
				balEnq();

		}

		else{
			System.out.println("Sorry your amount is not a multiple of 100!!");
		}

		rsm();

	}

	//OPTIONAL
	public void pinGen(){

		System.out.println("Functionality is coming soon!!!");
		rsm();

	}

	public void rsm(){
		System.out.println("Press 1 for continue transaction");
		int re = i.nextInt();
		if(re==1){
			open();
		}
		else{
			System.exit(0);
		}

	}



	//Calling Main Funtion
	public static void main(String[] args){
		
		ATM atm = new ATM();
		atm.evaluation();
	}
      


}