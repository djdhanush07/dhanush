package atmmechine;
import java.util.*;
public class Atmcompleateproject
{
	public static void main(String[] args)
  {
		
	
    int pin=123;
    int balance=10000;
    
    int addamount=0;
    int takeamount=0;
    String name; 
    
    Scanner scanner=new Scanner(System.in);
    
    
    //we have to take an input by an user
    System.out.println("enter your pin number");
    
    int password=scanner.nextInt();
    
    //code arrangement shift+alt+f
    
    
    if (password==pin)
    {
    	System.out.println("enter your name");
    	name=scanner.next();
    	System.out.println("welcome MR" +name);
    	while(true)
    	{
    		System.out.println("press 1 to check balance");
    		System.out.println("press 2 to add amount");
    		System.out.println("press 3 to take amount");
    		System.out.println("press 4 to take resipt");
    		System.out.println("press 5 to exit");
    		
    		int opt= scanner.nextInt();
    		switch(opt)
    		{
    		case 1:
    			System.out.println("your current balance"+balance);
    			break;
    			
    		case 2:
    			System.out.println("how much amount did you want to add");
    			  addamount=scanner.nextInt();
    			  System.out.println("succesfully credited");
    			  balance=addamount+balance;
    			  //10000=2000+10000
    			  //balance=120000c
    			  break;
    			  
    		case 3:
    			System.out.println("how much amount you want to take ");
    			takeamount=scanner.nextInt();
    		if(takeamount>balance)
    			{
    			System.out.println("insufficient balance");
    			System.out.println("try less than your available balnce");
    			
    			}
    		else 
    		  {
    			System.out.println("sucessfully crdited");
    			balance=takeamount-balance;
    			//12000=3000-12000
    			//balance =9000
    		  }
    		
    			
    			break;
    		case 4:
    			
    			System.out.println("welcome mini atm");
    			System.out.println("available balance "+balance);
    			System.out.println("amount deposit"+addamount);
    			System.out.println("amount taken"+takeamount);
    			System.out.println("Thank You");
    			
    			break;
    			
    			
    		}	
    			if (opt==5)
    			{
    				System.out.println("thank you");
    				break;
    				
    			}
    		
    		
    	}
    }	
    
    
    	else 
    	{
    	      System.out.println("plese enter your correct pinnumber");	
    	}
    
    
    scanner.close();
  }
}







