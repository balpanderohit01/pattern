package pattern;

import java.util.Scanner;

public class Left_rightangle_No_trangle {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("enter the number");
		int num = sc.nextInt();
		for(int i=1;i<=num;i++) {
			
			for(int j=1;j<=num;j++) {
				System.out.print(i);
				if(i==j)
					break;
					System.out.print(" ");
			}
			System.out.println();
		}

	}
	}

}
