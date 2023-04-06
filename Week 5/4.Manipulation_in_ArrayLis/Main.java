import java.util.*;


public class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		boolean flag = true;
		List<Hall> hallList=new ArrayList<>();
		HallBO hob = new HallBO();
		hallList = hob.getHallList();
		String name,ownerName,costPerDay,contactNumber;
		while(flag){
			System.out.println("Enter an option:");
			System.out.println("1.Add\n2.Replace\n3.Display\n4.Exit");
			int option = Integer.parseInt(in.nextLine());
			switch(option){
				case 1: //add element
				{
					System.out.println("Enter the name of the hall:");
					name= in.nextLine();
					System.out.println("Enter the contact number of the hall:");
					contactNumber = in.nextLine();
					System.out.println("Enter the cost per day of the hall:");
					costPerDay = in.nextLine();
					System.out.println("Enter the owner name of the hall:");
					ownerName = in.nextLine();
					hallList.add(new Hall(name, contactNumber, Double.parseDouble(costPerDay), ownerName));
					System.out.println("Hall added successfully");	
				}
				break;
				case 2: //Replace element
				{
					System.out.println("Enter the hall number which should be replaced:");
					int pos = Integer.parseInt(in.nextLine());
					System.out.println("Enter the name of the replacement hall:");
					name= in.nextLine();
					System.out.println("Enter the contact number of the replacement hall:");
					contactNumber = in.nextLine();
					System.out.println("Enter the cost per day of the replacement hall:");
					costPerDay = in.nextLine();
					System.out.println("Enter the owner name of the replacement hall:");
					ownerName = in.nextLine();
					hallList.set(pos-1,new Hall(name, contactNumber, Double.parseDouble(costPerDay), ownerName));
					System.out.println("Hall replaced successfully");	
				}
				break;
				case 3: //Display all element
				{
						hob.displayAll(hallList);
				}
				break;
				case 4: //exit the program
				{
					System.out.println("Exiting Application");
					flag = false;
				}
				break;
				default:
				break;
			}
		}
	}
}
