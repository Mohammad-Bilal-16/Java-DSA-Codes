package Matrix;

import java.util.Scanner;

public class Find_Diagonal {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter The Row Size: ");
		int m=scan.nextInt();
		System.out.println("Enter The Column Size: ");
		int n=scan.nextInt();
		int a[][]=new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=scan.nextInt();
			}
		}
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		

	for (int i=0;i<m;i++){
	  for(int j=0;j<n;j++){
	    if(i==j){
	    System.out.println(a[i][j]);
	    }
	  }
	}

	}

}
