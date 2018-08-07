package management_system;

public abstract class Account {
		
	String firstName;		
	String lastName;
	String accountNumber;
	
	public Account(String firstName, String lastName, String accountNumber) {

			this.firstName = firstName;		
			this.lastName = lastName;
			this.accountNumber = accountNumber;

		}
		
		public String toString( ) {
			
			return firstName + lastName + accountNumber;			
			
		}
		
	}
	

