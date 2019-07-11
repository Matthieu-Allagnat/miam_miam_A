package ldnr.miam_miam.model;

//import java.util.List;

/*import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;*/
//import javax.persistence.OneToMany;*/

//@Entity
public class Pizza {
	
	/*@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	private Double price;
	private Integer size;//Possible String S/M/L
	
	@OneToMany
	private List<IngredientSupplementaire> supplements;

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

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public List<IngredientSupplementaire> getSupplements() {
		return supplements;
	}

	public void setSupplements(List<IngredientSupplementaire> supplements) {
		this.supplements = supplements;
	}*/
	
	private Long id;
    private String name;
    private String size;
    private int price;
 
    public Pizza() {
 
    }
 
    public Pizza(String name, String size, int price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
 
   
	
}
