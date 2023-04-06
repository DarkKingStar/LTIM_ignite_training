import java.util.*;
class Main{
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int userno=1;
		List<String> user = new ArrayList<String>();
		String Ans= "y";
		while(Ans.equals("y")){
			System.out.println("Enter the username "+userno);
			String s= in.next();
			user.add(s);
			System.out.println("Do you want to continue?(y/n)");
			Ans = in.next();
			userno++;
		}
		System.out.println("The Names entered are:");
		for(String i : user){
			System.out.println(i);
		}
	}
}
