package guvi;
import java.util.Scanner;
public class string_word_reverse {
	 public static void main(String args[]){
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the string:");
		 String n=sc.nextLine();
		 String s[]=n.split(" ");
		 for(int i=s.length-1;i>=0;i--){
			 System.out.print(s[i]+" ");
		 }
	  }
}
