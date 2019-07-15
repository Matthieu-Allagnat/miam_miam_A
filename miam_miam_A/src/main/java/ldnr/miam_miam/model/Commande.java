package ldnr.miam_miam.model;




import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Commande {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Double price = 0D;
	private Boolean isDelivered = false;
	private Boolean toDeliver = false;
	private String dateTime = "placeholder dateTIme"; //TODO : ensure it is set only once with java.time.DateTime
	// @ManyToMany ?
	//private List<Menu> menus;
	//private List<Pizza> pizzas;
	//private List<Boisson> boissons;
	private String menu = "placeholder menu";
	private String pizza = "placeholder pizza";
	private String boisson = "placeholder boisson";
	
	public Commande() {
		
	}
	public Commande (Double price, Boolean toDeliver , String pizza, String boisson  ) {
		this.price = price ;
		this.toDeliver = toDeliver;
		this.pizza = pizza;
		this.boisson = boisson;
		
	}
	public Commande(Integer id, Double price, Boolean isDelivered, Boolean toDeliver, String dateTime, String menu, String pizza, String boisson) {
		this.id=id;
		this.price=price;
		this.isDelivered=isDelivered;
		this.toDeliver=toDeliver;
		this.dateTime=dateTime;
		this.menu=menu;
		this.pizza=pizza;
		this.boisson=boisson;
	}
	
	

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public String getPizza() {
		return pizza;
	}

	public void setPizza(String pizza) {
		this.pizza = pizza;
	}

	public String getBoisson() {
		return boisson;
	}

	public void setBoisson(String boisson) {
		this.boisson = boisson;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Boolean getToDeliver() {
		return toDeliver;
	}

	public void setToDeliver(Boolean toDeliver) {
		this.toDeliver = toDeliver;
	}

	public Boolean getIsDelivered() {
		return isDelivered;
	}

	public void setIsDelivered(Boolean isDelivered) {
		this.isDelivered = isDelivered;
	}

	/*public List<Menu> getMenus() {
		return menus;
	}

	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}

	public List<Pizza> getPizzas() {
		return pizzas;
	}

	public void setPizzas(List<Pizza> pizzas) {
		this.pizzas = pizzas;
	}

	public List<Boisson> getBoissons() {
		return boissons;
	}

	public void setBoissons(List<Boisson> boissons) {
		this.boissons = boissons;
	}*/

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	

}
