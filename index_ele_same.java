package guvi;
import java.util.Scanner;
public class index_ele_same {
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of an array:");
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++){
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++){
		if(arr[i]==i){
			System.out.println(i);
		}
	}
}
}
