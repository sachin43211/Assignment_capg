package capg.com.practice;

public class Polymorphism {
	
	public void get(int a,int b) {
		
		int c = a+b;
		System.out.println("sum is \t"+c);
		
		
	}
	
	
	public void get() {
		
		System.out.println("second classs is executed");
		
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		
		
		
		Polymorphism p=new Polymorphism();
		p.get(10,20);
		p.get();
		
		
		

	}

}
