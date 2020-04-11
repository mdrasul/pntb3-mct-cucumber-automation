package multicard.test.data;

public class User {

	
	// Secure Private variables for user 
	String id;
	String password;
	String profileName;
	
	

	// Setter - to add Data for this User 
	public void setID(String id) {
		this.id = id;	
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setprofileName(String profileName) {
		this.profileName = profileName;
	}

	
	// Setter - to add Data for this User 
	public String getID() {
		return id;
	}

	public String getPassword() {
		return password;
	}
	
	public String getProfileName() {
		return profileName;
	}


	
}
