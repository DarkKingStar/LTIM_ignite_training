public class ItemType {
	private String name;
	private double  deposit;
	private double costPerday;
	ItemType(String name,double deposit,double costPerday){
		this.name=name;
		this.deposit=deposit;
		this.costPerday = costPerday;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setDeposit(double deposit){
		this.deposit = deposit;
	}
	public double getDeposit(){
		return deposit;
	}
	public void setCostPerDay(double costPerday){
		this.costPerday = costPerday;
	}
	public double getCostPerDay(){
		return costPerday;
	}
	public String toString(){
		return String.format("%-20s%-20s%-20s",name,deposit,costPerday);
	}
}