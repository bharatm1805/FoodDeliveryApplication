package FoodDeliveryAppResOwner.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class NetConform {
	
	@Id
	private String username;
	private String date;
	private String time;
	private int amount;
	private int tid;
	public NetConform() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NetConform(String username, String date, String time, int amount, int tid) {
		super();
		this.username = username;
		this.date = date;
		this.time = time;
		this.amount = amount;
		this.tid = tid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	
	
	
	
	
	

}
