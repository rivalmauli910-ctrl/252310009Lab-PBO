package Praktikum4;

public class Array2 {
	public static void main(String[] args) {
		
		double[][] x= new double[2][3];
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				x[i][j]=Math.random();
			}
		}
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(x[i][j]);
			}
		}
		
	}
}