package guvi;
import java.util.Scanner;
public class char_or_not {
	public static void main(String args[]){
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter one character");
		char ch = reader.next().charAt(0);
		reader.close();
		if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
			System.out.println(ch+" is an alphabet");
		}
		else
		{
			System.out.println(ch+" is not an alphabet");
		}
	}
}
