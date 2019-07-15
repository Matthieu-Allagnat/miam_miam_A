package ldnr.miam_miam.model;

import javax.persistence.Entity;

//import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String firstName;
	private String LastName;
	
	private String login;
	private String password; //TODO: Salt/hash before persisting
	private String verifPassword; //TODO: Salt/hash before persisting
	//Maybe create a dedicated address object
	private String postalCode;
	private String address;
	private String city;
	
	private String phoneNumber; //TODO: Ensure the telephone number follows a strict pattern
	private String emailAddress; //TODO : Ensure the emailAddress is valid
	private int numeroCommande;
	private boolean gerant;
	//@OneToMany
	//private List<Commande> commandes;
	
	public Client() {
		
	}
	
	public Client(Integer id, String firstName, String lastName, String login, String password, String verifPassword, String postalCode, String address, String city, String phoneNumber, String emailAddress, int numeroCommande, boolean gerant) {
		this.id= id;
		this.firstName=firstName;
		this.LastName=lastName;
		this.login=login;
		this.password=password;
		this.verifPassword=verifPassword;
		this.postalCode=postalCode;
		this.address=address;
		this.city=city;
		this.phoneNumber=phoneNumber;
		this.emailAddress=emailAddress;
		this.numeroCommande=numeroCommande;
		this.gerant=gerant;
	}
	
	

	

	public boolean isGerant() {
		return gerant;
	}

	public void setGerant(boolean gerant) {
		this.gerant = gerant;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getVerifPassword() {
		return verifPassword;
	}

	public void setVerifPassword(String verifPassword) {
		this.verifPassword = verifPassword;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getNumeroCommande() {
		return numeroCommande;
	}

	public void setNumeroCommande(int numeroCommande) {
		this.numeroCommande = numeroCommande;
	}

	

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	

	/*public List<Commande> getCommandes() {
		return commandes;
	}

	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}*/
	
	
}
