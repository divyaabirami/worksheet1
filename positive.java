package sample;

import java.util.Scanner;

public class positive {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("number");
		int n=obj.nextInt();
		int countposi=0;
		int countnega=0;
		int zero=0;
		int a[]=new int[n];
		System.out.println("enter the elements");
		for(int i=0;i<n;i++)
		{
			a[i]=obj.nextInt();
		}
		int j=0;
		while(j<n)
		{
			if(a[j]>0)
			{
				countposi++;
			}
			else if(a[j]<0)
			{
				countnega++;
			}
			else
			{
				zero++;
			}
		j++;
		}
		System.out.println("positive="+countposi);
		System.out.println("negative="+countnega);
		System.out.println("zero="+zero);
	}
}
		
		
		// TODO Auto-generated method stub

