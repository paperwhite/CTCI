import java.util.Scanner;

public class chapter1_1b{
	//assuming only characters a-z, and using an integer checker(32 bits)
	public static boolean check(String s){
		int relative_val = 0;
		int checker = 0;
		for(int i=0;i<s.length();i++){
			relative_val = s.charAt(i)-'a';
			if((checker & (1<<relative_val))>0 )
				return false;
			checker |= (1<<relative_val);
		}return true;
		
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		boolean val = check(s);
		input.close();
		System.out.println(val);
		
	}
	
}