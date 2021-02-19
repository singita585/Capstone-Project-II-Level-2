public class Contractor extends Person{
	
	// Methods   
	public Contractor(String Name, String Surname ,int PhoneNumber, String EmailAddress, String PhysicalAddress) {
		super(Name, PhoneNumber, EmailAddress, PhysicalAddress);
	 }
	   
	public String toString() {
		String output = "Name: " + Name;
		output += "\nPhone Number:" + PhoneNumber;
		output += "\nEmail Address:" + EmailAddress;
		output += "\nPhysical Address:" + PhysicalAddress;

		return output;
		}
}