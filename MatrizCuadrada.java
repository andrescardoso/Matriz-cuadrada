import java.util.Arrays;

public class MatrizCuadrada {
	
	int tamagno=4;
	double[][] matriz = new double[tamagno][tamagno];
	
	public MatrizCuadrada() {
		
	}
	
	public void formaMatriz() {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j]=Math.round((Math.random())*10);
			}
		}
		for (int j = 0; j < matriz.length; j++) {
			System.out.println(Arrays.toString(matriz[j]));
		}
	}
	
	public double mediaTotal() {
		formaMatriz();
		double acu=0;
		for (int i = 0; i < matriz.length; i++) {
				acu+=matriz[i][i];
			}
		System.out.println(acu/tamagno);
		System.out.println(respuesta(matriz));
		return acu/tamagno;
	}
	
	public boolean respuesta(double [][] matriz) {
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if(i!=j && this.mediaTotal()<matriz[i][j]) {
						return true;
					}	
				}
			}
		return false;
		}
	
	// MAIN
	public static void main(String[] args) {
		MatrizCuadrada obj = new MatrizCuadrada();
		obj.mediaTotal();
	}
}
