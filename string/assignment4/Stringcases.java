package capg.com.string.assignment4;



public class Stringcases {
public static void main(String[]args) {
	String str="Java Is A Very Good Website";
	String S1=str.toLowerCase();
	String S2=str.toUpperCase();
	String replaceString=S1.replaceAll("a","$");
	
	System.out.println("Uppercase String:"+S1);
	System.out.println("Lowercase String:"+S2);
	System.out.println(replaceString);
	
}
}
