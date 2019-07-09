package ldnr.miam_miam.model;

public class Gerant {
	
	   private String firstName;
	    private String lastName;
	 
	    public Gerant() {
	 
	    }
	 
	    public Gerant(String firstName, String lastName) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	    }
	 
	    public String getFirstName() {
	        return firstName;
	    }
	 
	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }
	 
	    public String getLastName() {
	        return lastName;
	    }
	 
	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }

}
