package capg.com.data_structure.assignment1;

import java.util.Scanner;

public class IncomeTax {
	public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        
       

                System.out.print("Enter your income: ");
                double inc = sc.nextDouble();
                double tax;
                if( inc>=0 && inc<=180000)

                {
                   System.out.println("slab A Nill");
                }
                else if((inc>180001)&&(inc<=300000))
                {
                    tax = (inc * 10/100);
                    System.out.println(" slab B 10% is \t "+tax);
                }
                
                else if((inc>300001)&&(inc<=500000))
                {
                	tax = (inc * 20/100);
                    System.out.println(" slab C 20%is \t"+tax);
                }

                else if((inc>500001)&&(inc<=1000000))
                {
                	tax = (inc * 30/100);
                    System.out.println(" slab D 30%is \t"+tax);
                }
                
    }
	}