package in.sp.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class student {
	
	private String name;
	private int no;
	@Autowired
	private Address address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void display() {
		
		System.out.println("name: "+name);
		System.out.println("no: "+no);
		System.out.println("Address: "+address);
		
	}
	
	
	

}
