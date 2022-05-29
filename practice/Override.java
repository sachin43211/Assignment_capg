package capg.com.practice;

class main{
	
	public void get() {
		
		System.out.println("first class overloaded");
	}
	
	
	
}
public class Override extends main {
	
	public void get() {
		System.out.println("second class overloaded");
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Override m = new Override();
		m.get();
		
		
		
		
		
	}

}
