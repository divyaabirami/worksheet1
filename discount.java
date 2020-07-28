package sample;

import java.util.Scanner;

//import java.util.Scanner;

public class discount {
	public static void main(String arg[]) {
		Scanner o = new Scanner(System.in);
		int am, di, or;
		System.out.println("enter o.amm &dis");
		or = o.nextInt();
		di = o.nextInt();
		am = (or - (or*di/100));
		System.out.println("amount=" + am);

	}
}
