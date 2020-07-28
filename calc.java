package sample;

import java.util.Scanner;
public class calc {
	public static void main (String[] args) {

	
	//	Scanner obj=new Scanner(System.in);
//int a,b;                                                  
//System.out.println("enter");                            
//a=obj.nextInt();                                         
//b=obj.nextInt();
//System.out.println("1.add");
//System.out.println("2.sub");
//System.out.println("3.mul");
//System.out.println("4.div");
//System.out.println("enter the choice");
//int n=obj.nextInt();
//switch(n)
//{
//case 1:
//{int c=a+b;
//System.out.println("add="+c);
//break;}
//case 2:
//{int d=a-b;
//System.out.println("sub="+d);
//break;}
//case 3:
//{int e=a*b;
//System.out.println("mul="+e);
//break;}
//case 4:
//{int f=a%b;
//System.out.println("div="+f);
//break;
//}
//default:
//{
//System.out.println("out of range");
//}

//}
		
		
		//or
	
		{		
int a=10,b=2;
Scanner obj=new Scanner(System.in);
char c=obj.next().charAt(0);            //0 will take the char only at 0th position.
switch(c)
{
case'+':System.out.println(a+b);
break;
case'-':System.out.println(a-b);
break;
case'*':System.out.println(a*b);
break;
case'/':System.out.println(a/b);
break;
default:
System.out.println("incorrect option");
}
	}
}


























	}