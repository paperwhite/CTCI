import java.util.Scanner;

public class chapter1_1{
	
	public static boolean check(String s){
		boolean success = true;
		boolean failure = false;
		
		char[] x = new char[256];
		char[] charArray = s.toCharArray();
		for(int i=0; i<s.length();i++){
			x[charArray[i]]= (char)(x[charArray[i]]^charArray[i]);
			//System.out.println("string "+x);
			if(((int)(x[charArray[i]])==0)){
				System.out.println(charArray[i]);
				return failure;
				
			}
			
		}	
		return success;
	}
	

	
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s;
		s = input.nextLine();
		boolean value = check(s);
		if(value == true)
			System.out.println("The string does not have duplicate characters");
		else
			System.out.println("The string has duplicate characters");
		input.close();
		
	}
	
}