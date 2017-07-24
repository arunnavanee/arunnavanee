package guvi;
import java.util.*;
import java.lang.*;
import java.io.*;
public class camel_conv {
	public static void main(String args[]) throws java.lang.Exception{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String sp[]=str.split(" ");
		for(String x: sp){
			String a=x.substring(0,1).toUpperCase();
			String b=x.substring(1);
			System.out.print(a+b+" ");
		}
	}
}
		
