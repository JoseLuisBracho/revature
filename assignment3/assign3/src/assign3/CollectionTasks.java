package assign3;

public class CollectionTasks {
	// Create a Custom Checked exception if the entered DL is valid or not.
	
	public boolean isValidDL(String dl) throws DLException {
		if (!dl.matches("[0-9]{9}")) {
			throw new DLException("\nThe number " + dl + " is not valid");
		}
		return true;
	}
	
	// Create a Custom Unchecked exception for checking if the entered Passport number is valid or not
	
	public boolean isValidPassport(String pass) throws PassportException {
		if (!pass.matches("[0-9]{9}")) {
			throw new PassportException("\nThe number " + pass + " is not valid");
		}
		return true;
	}
	
	// Try addAll() removeAll() retainAll() in set collections
	// --> addAll() verify if all elements listed are included in a collection

}
