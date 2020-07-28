package sample;

import java.util.Scanner;

public class fibo {

	public static void main(String arg [] ) {
		// TODO Auto-generated method stub
		int a=1,b=1;
		int c,n;
		 System.out.print("enter how many times need");
		 Scanner o=new Scanner(System.in);
		 n=o.nextInt();
		 System.out.println(a);
		 System.out.println(b);
		for (int i=0;i<n;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}

	}

}
