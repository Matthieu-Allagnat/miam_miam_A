package ldnr.miam_miam.model;

public class Gerant {
	
	private String nom;
	private int age;
	
	public Gerant() {
		
	}
	
	public Gerant(String nom, int age) {
		this.nom=nom;
		this.age=age;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	 
}
