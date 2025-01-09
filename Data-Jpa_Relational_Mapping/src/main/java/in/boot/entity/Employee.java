package in.boot.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String empName;

	@OneToOne(mappedBy = "emp", cascade = CascadeType.ALL)  // for bidirectional use "mappedBy"
	private Mobile mobile;

	
	@OneToMany						//(mappedBy = "emp",cascade = CascadeType.ALL)
	@JoinTable(name="dummy_address_column",
	joinColumns=@JoinColumn(name="address1"),
	inverseJoinColumns =@JoinColumn (name="address2"))
	private List<Address> address;				//another entity mapping

	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}

	
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Mobile getMobile() {
		return mobile;
	}

	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", mobile=" + mobile + "]";
	}

}
