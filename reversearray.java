package sample;

import java.util.Scanner;

public class reversearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner g=new Scanner(System.in);
int n,i;
System.out.println("enter");
n=g.nextInt();
int a[]=new int[10];
for(i=0;i<n;i++)
{
	a[i]=g.nextInt();
}
for(i=n-1;i>=0;i--)
{
System.out.println(a[i]);
	}
	}

}
 