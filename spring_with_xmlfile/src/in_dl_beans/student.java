package in_dl_beans;

public class student {
	private String name;
	private int roll_no;
	private String email;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void display()
	{
		System.out.println("Name: "+name);
		System.out.println("roll_no: "+roll_no);
		System.out.println("email: "+email);
		
		
	}
	
	
	
	
	

}
