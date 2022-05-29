package capg.com.data_structure.assignment1;

import java.util.Scanner;
class AverageMarks
{
   public static void main(String args[])
  {
 
    int i;
 
    System.out.println("Enter number of subjects");
 
    Scanner sc=new Scanner(System.in);
 
    int n=sc.nextInt();
 
    int[] a=new int[n];
 
    double avg=0;
 
    System.out.println("Enter marks");
 
    for( i=0;i<n;i++)
    {
       a[i]=sc.nextInt();
    }
 
    for( i=0;i<n;i++)
    {
      avg=avg+a[i];
    }
 
    for(i=0;i<n-1;i++)
    {
      System.out.print(a[i]+",");
    }
    System.out.println(a[i]+" ="+avg/n);
  }
}