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
	
	private Double price;
	private Boolean deliveryState;
	//@ManyToMany ?
	private List<Menu> menus;
	private List<Pizza> pizzas;
	private List<Boisson> boissons;
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
	public Boolean getDeliveryState() {
		return deliveryState;
	}
	public void setDeliveryState(Boolean deliveryState) {
		this.deliveryState = deliveryState;
	}
	public List<Menu> getMenus() {
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
	}
	
	
}
