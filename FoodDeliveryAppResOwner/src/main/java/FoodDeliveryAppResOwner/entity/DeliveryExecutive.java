package FoodDeliveryAppResOwner.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="delivery_executive")
public class DeliveryExecutive {
	@Id
	 @Column(name="e_id")
	 //@GeneratedValue(strategy=GenerationType.AUTO)
   private int eid;
	 @Column(name="ph_no")
   private int phno;
	 @Column(name="e_name")
   private String ename;
	 @Column(name="vehicle_no")
   private String vehicleno;
   @OneToOne
   @JoinColumn(name="oid")
   private Orders orderid;
   public DeliveryExecutive(){
	   
   }


public DeliveryExecutive(int eid, int phno, String ename, String vehicleno, Orders orderid) {
	super();
	this.eid = eid;
	this.phno = phno;
	this.ename = ename;
	this.vehicleno = vehicleno;
	this.orderid = orderid;
}


public Orders getOrderid() {
	return orderid;
}
public void setOrderid(Orders orderid) {
	this.orderid = orderid;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public int getPhno() {
	return phno;
}
public void setPhno(int phno) {
	this.phno = phno;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getVehicleno() {
	return vehicleno;
}
public void setVehicleno(String vehicleno) {
	this.vehicleno = vehicleno;
}
@Override
public String toString() {
	return "DeliveryExecutive [eid=" + eid + ", phno=" + phno + ", ename=" + ename + ", vehicleno=" + vehicleno + "]";
}
 
}
