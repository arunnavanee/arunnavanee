 package guvi;
import java.util.Scanner;
public class working_day {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String p=sc.next();
		String s=p.toLowerCase();
		sc.close();
		if(s.equals("monday")||s.equals("tuesday")||s.equals("wednesday")||s.equals("thursday")||s.equals("firday")||s.equals("saturday")){
			System.out.println("True");
		}
		else if(s.equals("sunday")){
			System.out.println("False");
		}
	}
}
