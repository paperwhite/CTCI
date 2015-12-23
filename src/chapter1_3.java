import java.util.Scanner;

public class chapter1_3{
	public static boolean check(String s, String t){
		char[] a = s.toCharArray();
		char[] b = t.toCharArray();
		
		return sort(a).equals(sort(b)); 
		
	}
	
	public static String sort(char[] c ){
		java.util.Arrays.sort(c);
		return new String(c);
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		String t = input.nextLine();
		boolean val = check(s,t);
		
		input.close();
		System.out.println(val);
		
	}
}	