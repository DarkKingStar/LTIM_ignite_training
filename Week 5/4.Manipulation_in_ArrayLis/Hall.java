public class Hall {
	private String name;
	private String contactNumber;
	private double costPerDay;
	private String ownerName;
	public Hall(String name,String contactNumber,double costPerDay,String ownerName){
		this.name = name;
		this. contactNumber = contactNumber;
		this.costPerDay = costPerDay;
		this.ownerName = ownerName;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setContactNumber(String contactNumber){
		this.contactNumber = contactNumber;
	}
	public void setcostPerDay(double costPerDay){
		this.costPerDay = costPerDay;
	}
	public void setOwnerName(String ownerName){
		this.ownerName = ownerName;
	}
	public String setName(){
		return name;
	}
	public String setContactNumber(){
		return contactNumber;
	}
	public double setcostPerDay(){
		return costPerDay;
	}
	public String  setOwnerName(){
		return ownerName;
	}
	public String toString(){
		return String.format("%-20s%-20s%-20s%-20s\n",name,contactNumber,costPerDay,ownerName);
	}
}
