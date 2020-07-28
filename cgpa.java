package sample;

import java.util.Scanner;

public class cgpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner obj=new Scanner (System.in);
System.out.println("enter 5 subject mark");
// a=obj.nextInt();
//int b=obj.nextInt();
//int c=obj.nextInt();
//int d=obj.nextInt();
//int e=obj.nextInt();
//float a1=a/10;
//float b1=b/10;
//float c1=c/10;
//float d1=d/10;
//float e1=e/10;
//float t=(a1+b1+c1+d1+e1);
//float cgpa=t/5;
//System.out.println("cgpa="+cgpa);


//or


double m[] = new double[10];
double c[]=new double[10];
double sum=0,csum=0;
int i;
int n=obj.nextInt();
for(i=0;i<n;i++)
{
	System.out.println("enter grade and credit for "+(i+1)+"subject");
	m[i]=obj.nextDouble();
	c[i]=obj.nextDouble();
	sum=sum+m[i]*c[i];
	csum=csum+c[i];
}
System.out.println("CGPA="+(sum/csum));
	}

}







//(grade1*credit1 +grade2*credit2+............)/(sum of credit)