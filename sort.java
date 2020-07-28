package sample;

import java.util.Scanner;

public class sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]=new int [20];
int n,temp;
Scanner obj=new Scanner(System.in);
System.out.println("enter length");
n=obj.nextInt();
System.out.println("enter ");
for(int i=0;i<n;i++)
{
	a[i]=obj.nextInt();
}
for(int i=0;i<n;i++)
{
	for(int j=i+1;j<n;j++)
	{
		if(a[i]>a[j])
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
}
System.out.println("AFTER SORT");
for(int i=0;i<n;i++)
{
	System.out.println(a[i]);
}
	}
}


