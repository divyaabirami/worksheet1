package sample;

import java.util.Scanner;

public class inttodigit {

public static void main(String[] args) {
	
			int n,d,i=0;
	
			int a[]=new int [10];
			Scanner obj=new Scanner (System.in);
			System.out.println("enter the integer ");
			 n = obj.nextInt();
			while(n>0)
			{
				d=n%10;
				a[i]=d;
				n=n/10;
				 i++;
			}
				System.out.println("after splitting");
				for(int j=i-1;j>=0;j--)
				System.out.println(a[j]);
					
			}
			

		}






	///i/p=5678  separate interger (mod 10)
	///0/p=           5678%10=8
	//5               5678/10=567 
	//6                567%10=7
	 //7               567/10=56     
	//8                 56%10=6
	///                 56/10=5
//	                  5%10=5
//	                  5/10=0
