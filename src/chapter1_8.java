import java.util.Scanner;

public class chapter1_8{
	
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String str1 = input.nextLine();
		String str2 = input.nextLine();
		
		StringBuffer a = new StringBuffer("");
		a.append(str1);
		a.append(str1);
		String str3 = a.toString();
		if(str3.contains(str2)){
			System.out.println("Yes it is a substring");
		}
		else System.out.println("No, it is not a substring");
			
		input.close();
	}
}