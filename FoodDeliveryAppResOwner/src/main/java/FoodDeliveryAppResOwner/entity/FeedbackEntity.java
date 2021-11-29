package FoodDeliveryAppResOwner.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FeedbackEntity
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String restaurantname;
	String rating;
	String needtoimprove;
	String customerlike;
	String reviews;
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRestaurantname() {
		return restaurantname;
	}
	public void setRestaurantname(String restaurantname) {
		this.restaurantname = restaurantname;
	}
	
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getNeedtoimprove() {
		return needtoimprove;
	}
	public void setNeedtoimprove(String needtoimprove) {
		this.needtoimprove = needtoimprove;
	}
	public String getCustomerlike() {
		return customerlike;
	}
	public void setCustomerlike(String customerlike) {
		this.customerlike = customerlike;
	}
	public String getReviews() {
		return reviews;
	}
	public void setReviews(String reviews) {
		this.reviews = reviews;
	}
}
