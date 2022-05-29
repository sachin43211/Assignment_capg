package capg.com.string.assignment4;


public class StringBufferA {

	public static void main(String[] args) {
	
		StringBuffer sb=new StringBuffer("StringBuffer ");
		System.out.println(	sb.append("is a peer class of string "));
		System.out.println(sb.append("that provides much of "));
		System.out.println(	sb.append("the functionality of strings"));
	
		StringBuffer sb1=new StringBuffer("it is used to  at the specified index position");
		System.out.println(sb1.insert(13, " insert text "));
		StringBuffer sb2=new StringBuffer("This method returns the reversed object on which it was called");
		System.out.println(sb2.reverse());
		
	}
}
