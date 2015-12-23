import java.util.Scanner;

public class chapter1_7{
	
	public static int[][] setzero(int[][] arr, int M, int N){
		boolean[] rows = new boolean[M];
		boolean[] columns = new boolean[N];
		for(int i=0;i<M;i++){
			for(int j =0;j<N;j++){
				if(arr[i][j]==0){
				rows[i]=true;
				columns[j]=true;
				}
			}
		}
		for(int i=0;i<M;i++){
			if(rows[i]==true){
				for(int j=0;j<N;j++){
					arr[i][j]=0;
				}
			}
		}
		for(int i=0;i<N;i++){
			if(rows[i]==true){
				for(int j=0;j<M;j++){
					arr[j][i]=0;
				}
			}
		}
		
		return(arr);
	}
	
	
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int M = s.nextInt();
		int N = s.nextInt();
		int[][] arr = new int[M][N];
		for(int i=0;i<M;i++){
			for(int j =0;j<N;j++){
				arr[i][j]=s.nextInt();
			}
		}	
		
		int[][] result = setzero(arr,M,N);
		
		for(int i=0;i<N;i++){
			for(int j =0;j<N;j++){
				System.out.print(result[i][j]+" ");
			}
			System.out.print('\n');
		}	
	}
}