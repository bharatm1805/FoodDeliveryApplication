package FoodDeliveryAppResOwner.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Payment {
	@Id
	private String gmail;
	private String password;
	private String cardholder;
	private String cardno;
	private String date;
	private int cvv;
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Payment(String gmail, String password, String cardholder, String cardno, String date, int cvv) {
		super();
		this.gmail = gmail;
		this.password = password;
		this.cardholder = cardholder;
		this.cardno = cardno;
		this.date = date;
		this.cvv = cvv;
	}
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCardholder() {
		return cardholder;
	}
	public void setCardholder(String cardholder) {
		this.cardholder = cardholder;
	}
	public String getCardno() {
		return cardno;
	}
	public void setCardno(String cardno) {
		this.cardno = cardno;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	
	

}
