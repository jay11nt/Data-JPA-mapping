package in.boot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Address 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;				//instance variables
		private String address;
		private String type;
	
		
		@ManyToOne			//bidirectional mapping
		private Employee emp;
			//getter setter for employee
		public Employee getEmp() {
			return emp;
		}
		public void setEmp(Employee emp) {
			this.emp = emp;
		}
		
		
		//getter setter for instance variables
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		@Override
		public String toString() {
			return "Address [id=" + id + ", address=" + address + ", type=" + type + "]";
		}
		
		
		
}
