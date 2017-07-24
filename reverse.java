package guvi;
import java.util.Scanner;
public class reverse {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String str="dlrow olleh";
		sc.close();
		StringBuilder sb=new StringBuilder(str);
		StringBuilder rev=sb.reverse();
		System.out.println(rev);
	}
}
