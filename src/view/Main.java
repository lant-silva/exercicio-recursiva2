package view;
public class Main {
	
	public static void main(String[] args) {
		
		int[] vetor = {3,6,8,4,1,2,9,12,13,15,14,10};
		int tamanho = vetor.length;
		int vetorMenor = vetor[tamanho-1];
		int menor = recursaoMenor(vetor, tamanho, vetorMenor);
		System.out.println(menor);
	}

	private static int recursaoMenor(int[] vetor, int tamanho, int vetorMenor) {
		
		if(tamanho == 0) { // condição de parada
			return vetorMenor;
		}
		tamanho--;
		vetorMenor = recursaoMenor(vetor, tamanho, vetorMenor); // chamada recursiva
		if(vetorMenor < vetor[tamanho]) {
			return vetorMenor;
		}else {
			return vetor[tamanho];
		}
	}
	
}
