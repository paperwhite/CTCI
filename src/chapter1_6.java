import java.util.Scanner;

public class chapter1_6{
	
	public static int[][] modify(int[][] arr, int N){
		int[][] modified = new int[N][N];
		for(int i=0;i<N;i++){
			for(int j =0; j<N;j++){
				modified[j][N-i-1]=arr[i][j];
				
			}	
		}
		return(modified);
		
	}
	
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int[][] arr = new int[N][N];
		for(int i=0;i<N;i++){
			for(int j =0;j<N;j++){
				arr[i][j]=s.nextInt();
			}
		}	
		int[][] modified_arr = modify(arr,N);
		System.out.print("\nModified Matrix: \n");
		for(int i=0;i<N;i++){
			for(int j =0;j<N;j++){
				System.out.print(modified_arr[i][j]+" ");
			}
			System.out.print('\n');
		}	
		
		s.close();
		
	}
}