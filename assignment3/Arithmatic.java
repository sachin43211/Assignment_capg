package capg.com.assignment3;

import java.util.Scanner;

public class Arithmatic{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int One=sc.nextInt();
		int Two=sc.nextInt();
		
		try
		{
			int result=(One/Two);
			System.out.println(result);
			
		}
		catch(Exception e)
		{
			System.out.println("Number cannot be divided by zero");
		}
		sc.close();
	}

}