import java.util.*;
public class Main {
	public static void main(String args[]) throws Exception{
		Scanner in = new Scanner(System.in);
		ArrayList<ItemType> obj = new ArrayList<>();
		String ans="y"; 
		int n=1;
		while(true){
			System.out.println("Enter the details of Item Type "+n);
			System.out.println("Name:");
			String name = in.nextLine();
			System.out.println("Deposit:");
			double deposit =Double.parseDouble(in.nextLine());
			System.out.println("Cost per Day:");
			double costPerDay = Double.parseDouble(in.nextLine());
			System.out.println("Do you want to continue?(y/n)");
			ans= in.nextLine();
			obj.add(new ItemType(name,deposit,costPerDay));
			if(ans.equals("n")){
				break;
			}
			n++;
		}
		System.out.printf("%-20s%-20s%-20s", "Name" ,"Deposit" , "CostPerDay" );
		System.out.println();
		for(ItemType i: obj){
			System.out.println(i.toString());
		}
	}
}
