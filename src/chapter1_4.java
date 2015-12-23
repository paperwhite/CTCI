import java.util.Scanner;

public class chapter1_4{
	public static StringBuffer modify(String s){
		char[] ch = s.toCharArray();
		StringBuffer a = new StringBuffer();
		for(int i=0;i<s.length();i++){
			//int j=i;
			if(ch[i]==' '){
			a.append("%20");	
			}
			else
				a.append(ch[i]);
		}
		return(a);
		
	}
	
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		StringBuffer result = modify(str);
		input.close();
		System.out.println("The modified string is : "+ result);
	}
}