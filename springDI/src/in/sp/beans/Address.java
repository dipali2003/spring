package in.sp.beans;

public class Address {
	private int houseno;
	private String name;
	private int pincode;
	
	
	public int getHouseno() {
		return houseno;
	}
	public String getName() {
		return name;
	}
	public int getPincode() {
		return pincode;
	}
	public void setHouseno(int houseno) {
		this.houseno = houseno;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	@Override
	 public String toString(){
		return "#"+houseno+" "+name+"-- "+pincode+" ";
		
	}
	
	
	
	

}
