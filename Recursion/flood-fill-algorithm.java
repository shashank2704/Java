import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t_i = 0; t_i < T; t_i++){
		    int N = sc.nextInt();
		    int M = sc.nextInt();
		    int[][] a= new int[N][M];
		    boolean[][] visited = new boolean[N][M];
		    for(int i = 0; i < N; i++){
		        for(int j =0; j < M; j++){
		            a[i][j] = sc.nextInt();
		            visited[i][j] = false;
		        }
		    }
		    
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int k = sc.nextInt();
		    if(x<N&&x>=0&&y<M&&y>=0)
		        floodFill(a,visited,N,M,x,y,k);
		    
		    for(int i = 0; i < N; i++){
		        for(int j =0; j < M; j++){
		            System.out.print(a[i][j]+" ");
		        }
		    }
		    
		    System.out.println();
		}
	}
	
	private static void floodFill(int[][] a,boolean[][] visited, int N, int M, int x, int y, int k){
	    visited[x][y] = true;
	    if(x>0 && a[x-1][y]==a[x][y]&&!visited[x-1][y]){
	        floodFill(a,visited,N,M,x-1,y,k);
	    }
	    if(y>0 && a[x][y-1]==a[x][y]&&!visited[x][y-1]){
	        floodFill(a,visited,N,M,x,y-1,k);
	    }
	    if(x<N-1 && a[x+1][y]==a[x][y]&&!visited[x+1][y]){
	        floodFill(a,visited,N,M,x+1,y,k);
	    }
	    if(y<M-1 && a[x][y+1]==a[x][y]&&!visited[x][y+1]){
	        floodFill(a,visited,N,M,x,y+1,k);
	    }
	    a[x][y]=k;
	}
}