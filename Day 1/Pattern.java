

import java.util.Scanner;



public class Pattern {

	public static void pattern1(int n) {

		for(int i=1;i<=n;i++) {

			for(int j=n;j>=i;j--) {

				System.out.print("*");

			}System.out.println(" ");

		}

	}

	

	

public static void pattern3(int n) {

	for(int i=1;i<=n;i++) {

		System.out.println("* ".repeat(n));

	}

}

	

public static void pattern2(int n) {

	for(int i=1;i<=n;i++) {

		System.out.println("* ".repeat(i));

	}

}

public static void pattern4(int n)	{

	for(int i=0;i<=n;i++) {

		System.out.println("* ".repeat(n-i));

	}

}

public static void trianglegillugillu(int n) {

	 int space=n-1;

	 int star=1;

	 for(int i=1;i<=n;i++) {

		 System.out.print("  ".repeat(space));

		 System.out.println("* ".repeat(star));

		 space=space-1;

		 star=star+2;

	 }

}



public static void trianglegillugillu22(int n) {

	 int space=n-1;

	 int star=1;

	 for(int i=1;i<=n;i++) {

		 System.out.print("  ".repeat(space));

		 System.out.println("* ".repeat(star));

		 space=space-1;

		 star=star+1;

	 }

}

public static void triangleReversegillugillu(int n) { 

	int space=0;

	int star=(n*2)-1;

	for(int i=1;i<=n;i++) {

		System.out.print("  ".repeat(space));

		System.out.println("* ".repeat(star));

		space=space+1;

		star=star-2;

	}

}

public static void mutabonda(int n) {

	

	int star=1;

	for(int i=1;i<=(2*n)-1;i++) {

		System.out.println("* ".repeat(star));

		if(i<n) {

		 star++;

    	}

		else {

			star--;

		}

		

		

		

	}

}

public static void mutabonda22(int n) {

	int space=n-1;

	int star=1;

	for(int i=1;i<=(2*n);i++) {

		System.out.print("  ".repeat(space));

		System.out.println("* ".repeat(star));

		if(i<n) {

			space--;

		 star=star+2;

    	}

		

		else if(i>n) {

			space++;

			star=star-2;

		}

	}

}

public static void mutabonda2222(int n) {



	int star=1;

	for(int i=1;i<=(2*n);i++) {

		System.out.println("* ".repeat(star));

		if(i<n) {

		 star=star+1;

    	}

		else if(i>n) {

		

			star=star-1;

		}

	}

}



	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);

		System.out.println("enter n");

		int n=sc.nextInt();

//		pattern3(n);

//		trianglegillugillu22(n);

//		triangleReversegillugillu(n);

		mutabonda22(n);

		sc.close();



	}

	

	

	

	



}

      
