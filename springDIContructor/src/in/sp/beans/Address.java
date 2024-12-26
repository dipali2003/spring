package in.sp.beans;

public class Address {
	private int houseno;
	private String name;
	
	
	public Address(int houseno,String name) {
		
		this.houseno=houseno;
		this.name=name;
	}
	@Override
	 public String toString(){
		return "#"+houseno+" "+name+" ";
		
	}
	

}
