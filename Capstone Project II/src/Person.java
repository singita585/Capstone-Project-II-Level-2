public class Person {
	
	// Attributes
	String Name;
	String Surname;
	int PhoneNumber;
	String EmailAddress;
	String PhysicalAddress;

	// Methods
	public Person(String Name, String Surname, int PhoneNumber, String EmailAddress, String PhysicalAddress) {
		this.Name = Name;
		this.Surname = surname;
		this.PhoneNumber = PhoneNumber;
		this.EmailAddress = EmailAddress;
		this.PhysicalAddress = PhysicalAddress;
	}
	
    public void setPhoneNumber (int PhoneNumber) {
    	this.PhoneNumber = PhoneNumber;
    }
    public void setEmailAddress (String EmailAddress){
    	this.EmailAddress = EmailAddress;
       
    }
	
	    public String toString() {
		String output = "";	
		output = "Name: " + Name + " "+ Surname;
		output += "\nTPhone Number:" + PhoneNumber;
		output += "\nEmail Address:" + EmailAddress;
		output += "\nPhysical Address:" + PhysicalAddress;
		return output;
	   }
}
