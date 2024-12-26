package in.sp.beans;

public class emp {
	
	private String name;
	private int sal;
	private Address address;
	
	
	public emp(String name,int sal,Address address) {
		
		this.name=name;
		this.sal=sal;
		this.address=address;
	}
	
	public void display() {
		System.out.println("name : "+name);
		System.out.println("sal : "+sal);
		System.out.println("Address : "+address);
		
	}
	
	
	

}
