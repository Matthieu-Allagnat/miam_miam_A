package ldnr.miam_miam.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Boisson {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String name;
	private Double price;

	public Boisson() {
	}

	public Boisson(Integer id, String name, Double price) {
		this.id=id;
		this.name=name;
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	/*
	 * private String name; private String price;
	 * 
	 * public Boisson() {}
	 * 
	 * public Boisson(String name, String price) { this.name=name; this.price=price;
	 * }
	 * 
	 * public String getName() { return name; }
	 * 
	 * public void setName(String name) { this.name = name; }
	 * 
	 * public String getPrice() { return price; }
	 * 
	 * public void setPrice(String price) { this.price = price; }
	 */

}
