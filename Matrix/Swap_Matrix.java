package Matrix;

import java.util.Scanner;

public class Swap_Matrix {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		int a[][] = new int[n][m];
		for(int i = 0 ; i < n ; i++)
		{
			for(int j = 0 ; j < m ; j++)
			{
				a[i][j] = scan.nextInt();
			}
		}
		
		 for (int i = 0; i < n; i++)
		 {
	            for (int j = i; j < m; j++)
	            {
	            	int temp = a[i][j];
	            	a[i][j] = a[j][i];
	            	a[j][i] = temp;
	            }
	}
		 for (int i = 0; i < n; i++)
		 {
	            for (int j = 0; j < m; j++)
	            {
	            	System.out.print(a[i][j]+ " ");
	            }
		 System.out.println();
		 }
}
}
