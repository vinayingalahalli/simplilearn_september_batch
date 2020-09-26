package ex1;

public class BusinessLogic {

	public int[][] addMatrices(int[][] firstMatrix, int[][] secondMatrix,int r1,int c1,int r2, int c2) {

		int [][]results=new int[r1][c2];
		
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c2; j++) {
				for (int k = 0; k < c1; k++) {
					results[i][j]=firstMatrix[i][k]+secondMatrix[k][j];
				}
			}
		}
		
		return results;
	}
}
