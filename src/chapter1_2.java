import java.util.Scanner;

public class chapter1_2{
	
	public static StringBuffer reverse(String s){
		StringBuffer a = new StringBuffer("");
		for(int i=(s.length()-1);i>=0;i--){
			a.append(s.charAt(i));
		}
		//System.out.println("The reversed string is : "+ a);
		return(a);
	}
	
	
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		StringBuffer result = reverse(str);
		input.close();
		System.out.println("The reversed string is : "+ result);
	}
}