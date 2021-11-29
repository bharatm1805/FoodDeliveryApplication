package FoodDeliveryAppResOwner.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Confirmation {
	
	@Id
	private int Tid;
	private String date;
	private String name;
	private String time;
	private int amount;
	
	
	
	
	public Confirmation(int tid, String date, String name, String time, int amount) {
		super();
		Tid = tid;
		this.date = date;
		this.name = name;
		this.time = time;
		this.amount = amount;
	}
	public Confirmation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getTid() {
		return Tid;
	}
	public void setTid(int tid) {
		Tid = tid;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	
	

}
