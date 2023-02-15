package Atminterface;
import java.util.*;
public class Task3AtmInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int bal=20000,withdraw,deposite,transfer,num;
       int history;
       Scanner sc=new Scanner(System.in);
       while(true) {
    	   System.out.println("Welcom to ATM...");
    	   System.out.println("1.Transaction history.");
    	   System.out.println("2.Withdraw.");
    	   System.out.println("3.Deposite.");
    	   System.out.println("4.Transfer.");
    	   System.out.println("5.QUIT.");
    	   num=sc.nextInt();
    	   switch(num) {
    	   case 1:
    		   System.out.println("enter the pin to see the transaction history");
    		   history=sc.nextInt();
    		   System.out.println("yor transaction history is got chek your txt message");
    		   
    	   case 2:
    		   System.out.println("Enter amount for withdraw");
    		   withdraw=sc.nextInt();
    		   if(bal>=withdraw) {
    			   bal=bal - withdraw;
    			   System.out.println("amount is"+bal);
    			   System.out.println("collect your amount");}
    		   else {
    			   System.out.println("insufficient balance");
    		   }break;
    		   
    	   case 3:
    		   System.out.println("Enter amount to deposite");
    		   deposite=sc.nextInt();
    		   bal=bal+deposite;
    		   System.out.println("Balance amount is:"+bal);
    		   System.out.println("Money has been deposited succesfully.");
    		   break;
    	   case 4:
    		   System.out.println("Enter the account no to transfer ");
    		   transfer=sc.nextInt();
    		   System.out.println("Enter amount to transfer");
    		   bal=bal-transfer;
    		   System.out.println("Amount is transfed successfully");
    	   case 5:
    		   System.exit(0);
    		   System.out.println("Quit ");
    		   
    	   }
       }
       
	}
	}

