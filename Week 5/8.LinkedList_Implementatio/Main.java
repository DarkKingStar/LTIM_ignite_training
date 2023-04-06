import java.util.LinkedList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<String>();
        System.out.println("Enter the number of participants to be registered : ");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the participants details");
        for (int i = 0; i < a; i++) {
            String str = sc.nextLine().trim().replaceAll("\\s", "_");
            list.add(str);
        }
        boolean foundValid = false;
        for (String x : list) {
            String[] parts = x.split("_");
            if (parts.length == 3 && (parts[1].equals("IT") || parts[1].equals("CSE") || parts[1].equals("ECE"))) {
                if (parts[2].length() == 7) {
                    if (!foundValid) {
                        System.out.println("List of valid participants");
                        foundValid = true;
                    }
                    System.out.println(x);
                }
            }
        }
        if (!foundValid) {
            System.out.println("No valid participants");
        }
    }
}
