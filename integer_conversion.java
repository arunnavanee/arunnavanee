//string to integer
package guvi;
import java.util.Scanner;
public class integer_conversion {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.next();
		sc.close();
		int value=Integer.parseInt(str);
		System.out.println(value);
	}
}
