package in.sp.beans;

public class student {
	
	private String name;
	private int rollno;
	
	private Address address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void display() {
		
		System.out.println("name: "+name);
		System.out.println("rollno: "+rollno);
		System.out.println("Address: "+address);
	}
	
	

}
