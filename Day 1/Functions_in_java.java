package friend;
//import java.util.Scanner;

public class Functions_in_java {
	public static int sum(int a,int b) {
		return a+b;	
		
	}
	public static int sub(int a,int b) {
		int d=a-b;
		return d;
	}
	public static int mul(int a,int b) {
		int e=a*b;
		return e;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20;
		int b=10;
		int addition=sum(a,b);
		System.out.println(addition);
		int subraction=sub(a,b);
		System.out.println(subraction);	
		System.out.println(mul(addition,subraction));
		
		
		
	}

}
