import java.io.BufferedReader;
import java.io.*;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> list=new ArrayList<String>();
        System.out.println("Enter the number of passengers Booked");
        int a=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the passenger's name who Booked");
        for(int i=0;i<a;i++){
            list.add(sc.nextLine());
        }
        System.out.println("Enter the number of seats available");
        int b=sc.nextInt();
        System.out.println("Extra Passengers list");
        System.out.println(list.subList(b,a));
    }
}
