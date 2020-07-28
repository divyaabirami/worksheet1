package sample;

import java.util.Scanner;

public class sumtwo {
public static void main(String d[])
{
	Scanner p=new Scanner(System.in);
	System.out.println("enter the limit");
	int n=p.nextInt();
	//int a=p.nextInt();
	//int sum=0;
	//int b=p.nextInt();
	//int c=a+b;
	//System.out.println("addition of"+a+"and"+b+"is"+(a+b));   ///addition of 2 and 3 =5
	//System.out.println("addition of "+a+"and"+b+"="+c);  ///addition of 2 and 3 =5
	//System.out.println("sum of 2 number ="+c); //5

	
	int sum=0;
	
	for(int i=0;i<n;i++)
	{
		sum=sum+p.nextInt();
	}
	System.out.println("sum="+sum);
}
}
