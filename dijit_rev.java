package guvi;
import java.util.Scanner;
public class dijit_rev {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int x=sc.nextInt();
		int array[]=new int[x];
		sc.close();
		while(x>0){
			array[array.length-1]=x%10;
			x=x/10;
			System.out.print(array[array.length-1]);
		}		
	}
}
