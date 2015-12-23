import java.util.Scanner;

public class chapter1_5{

	public static StringBuffer compress(String s){
		StringBuffer a =new StringBuffer("");
		char[] ch = s.toCharArray();
		char temp='\0';
		int count = 0;
		for(int i=0;i<s.length();i++){
			
			if(i==0){
				temp = ch[i];
				a.append(ch[i]);
				count++;
				continue;
			}
			else if(i==(s.length()-1))
			{
				if(temp==ch[i]){
					count++;
				}
				else{
					a.append(ch[i]);
					count =1;
				}
				a.append(count);
			}
			else{
				if(temp == ch[i]){
					count++;	
					continue;
				}
				else{
					a.append(count);
					a.append(ch[i]);
					count = 1;
					temp = ch[i];
				}
			}
			
		}
		
		return(a);
	}

	
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		StringBuffer result = compress(str);
		input.close();
		System.out.println("The compressed string is : "+ result);
	}

}