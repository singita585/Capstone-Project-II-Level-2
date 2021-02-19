public class Customer extends Person{
	
	String customerInv;
	
	// Methods
	public Customer(String Name, String Surname, int PhoneNumber, String EmailAddress, String PhysicalAddress) {
		super(Name, PhoneNumber, EmailAddress, PhysicalAddress);

		this.customerInv = customerInv;

	}
	
	public void setcustomerInv(){

		this.customerInv = customerInv;

	}
		

	public String toString() {
		String output = "Name: " + Name;
		output += "\nPhone Number:" + PhoneNumber;
		output += "\nEmail Address:" + EmailAddress;
		output += "\nPhysical Address:" + PhysicalAddress;
		output += "\nCustomer Invoice: " + customerInv;
		
		return output;
	   }
}