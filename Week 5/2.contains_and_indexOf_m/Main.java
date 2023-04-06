import java.util.*;
public class Main {
	public static void main(String args[]) throws Exception{
		Scanner in = new Scanner(System.in);
		List<String> hall = new ArrayList<String>();
		System.out.println("Enter the number of halls:");
		int num = in.nextInt();
		for(int i=1;i<=num;i++){
			System.out.println("Enter the Hall Name "+i);
			String h = in.next();
			hall.add(h);
		}
		System.out.println("Enter the hall name to be searched:");
		String srch= in.next();
		if(hall.contains(srch))
			System.out.println(srch+" hall is found in the list at position "+hall.indexOf(srch));
		else
			System.out.println(srch+" hall is not found");
	}
}
