
import java.util.Scanner;

public class Project {

   public static void main( String[] args) {
	  
	  // In this section we capture the details that are used to create a new project
      // object.
	   Scanner keyboard = new Scanner(System.in);
	   //Here we ask the user to enter the number of the project
	   int Number = 0;
	   System.out.println("Enter the number of the project: ");
	   Number = keyboard.nextInt();
	   keyboard.nextLine();
	   
	   //Here we ask the user to enter the name of the project
	   System.out.println("Enter the name of the project: ");
       String Name = keyboard.nextLine();
       
	   //Here we ask the user what type of building is being designed
       System.out.println("What type of building is being designed: ");
       String building = keyboard.nextLine();
       
	   //Here the user must enter the address of the project
       System.out.println("Enter the physical address for the project: ");
       String address = keyboard.nextLine();
       
	   //Here the user must enter the ERF number
       int ErfNumber = 0;
       try {
    	   System.out.println("Enter the Erf Number: ");
    	   ErfNumber = keyboard.nextInt();
    	   keyboard.nextLine();
       
       } catch (Exception e) {
    	   System.out.println("Please enter the correct format: ");
    	   keyboard.next();
       }
       
	   // Here the user must enter the total fee that is being charged
	   // for the project
       Double TotalFee = 0.0;
       try {
    	   System.out.println("Enter the total fee being charged for the project: ");
    	   TotalFee = keyboard.nextDouble();
    	   keyboard.nextLine();
       } catch (Exception e) {
    	   System.out.println("Please enter the correct format: ");
    	   keyboard.next();
       }
       
	   //In this section we change the total amount of the fee paid to date
       Double TotalAmount = 0.0;
       try {
    	   System.out.println("Enter the total amount paid to date: ");
    	   TotalAmount = keyboard.nextDouble();
    	   keyboard.nextLine();
       } catch (Exception e) {
    	   System.out.println("Please enter the correct format: ");
    	   keyboard.next();
       }
       
	   //In this section we change the due date of the project
       System.out.println("Enter the due date of the project: ");
       String duedate = keyboard.nextLine();
       
	   //Here we change the total amount of the fee paid to date.
       Double newTotalFee = 0.0;
       try {
    	   System.out.println("Enter new fee paid by the customer:");
    	   newTotalFee = keyboard.nextDouble();
    	   keyboard.nextLine();
       } catch (Exception e) {
    	   System.out.println("Please enter the correct format: ");
    	   keyboard.next();
       }
       
       System.out.println("Enter the name of the Architect:");
       String architectName = keyboard.nextLine();

       System.out.println("Enter the surname of the Architect:");
       String architectSurname = keyboard.nextLine();

     //Added try catch block to make sure user inputs correct format
       int architectPhoneNumber = 0;
       while (true) {
    	   try {
    		   System.out.println("Enter Architect's phone number");
    		   architectPhoneNumber = input.nextInt();
    		   keyboard.nextLine();
    		   break;

    	   }   catch ( Exception e) {
    		   System.out.println("Please enter correct format");
    		   keyboard.next();
    	   }
       }

       System.out.println("Enter Architect email address:");
       String architectEmailAddress = keyboard.nextLine();

       System.out.println("Enter Architect physical address:");
       String architectPhysicalAddress = keyboard.nextLine();

       //Details of the customer
       System.out.println("Enter the Customer name:");
       String customerName = keyboard.nextLine();

       System.out.println("Enter the Customer surname:");
       String customerSurname = keyboard.nextLine();

       //Added try catch block to make sure user inputs correct format

       int customerPhoneNumber = 0;
       while (true) {
    	   try {
    		   System.out.println("Enter Customer phone number:");
    		   customerPhoneNumber = keyboard.nextInt();
    		   keyboard.nextLine();
    		   break;
    	   } catch ( Exception e) {
    		   System.out.println("Please enter correct format");
    		   keyboard.next();
    	   }
       }

       System.out.println("Enter the Customer email address");
       String customerEmailAddress = keyboard.nextLine();

       System.out.println("Enter the Customer physical address");
       String customerPhysicalAddress = keyboard.nextLine();
       
	   //Here we Update the contractor's contact details
       
       System.out.println("Enter the name of the Contractor: ");
       String contractorName = keyboard.nextLine();

       System.out.println("Enter the surname of Contractor: ");
       String contractorSurname = keyboard.nextLine();
       
       
     //Added try catch block to make sure user inputs correct format
       int newPhoneNumber = 0;
       try {
    	   System.out.println("Enter contractor's contact details: ");
    	   newPhoneNumber = keyboard.nextInt();
    	   keyboard.nextLine();
       } catch (Exception e) {
    	   System.out.println("Please enter the correct format: ");
    	   keyboard.next();
       }
       
       System.out.println("Enter the Contrator's email address:");
       String contractorEmailAddress = keyboard.nextLine();

       System.out.println("Enter the Contractor's physical address:");
       String contractorPhysicalAddress = keyboard.nextLine();

    }
	   
	   
}
   
   
 