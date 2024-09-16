package view;

import br.edu.fateczl.pilhaIntString.PilhaString;

public class Principal {

	public static void main(String[] args) {
		PilhaString pilhaString = new PilhaString();
		PilhaString pilhaFinal = new PilhaString();
		
		String[] vetor = {"J", "G", "R", "B", "H", "L", "W"};
		String[] aux = {"M", "K"};
		
		int tamanho = vetor.length;
		int pivo = 0;
		
		for(int i = 0; i < tamanho; i++) {
			pilhaString.push(vetor[i]);
		}
		
		int k = 0;
		
		for(int i = 0; i < tamanho; i++) {
			String valor = "";
			
			try {
				valor = pilhaString.pop();
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
			
			if(i == 4 || i == 6) {
				pilhaFinal.push(aux[k++]);
			}
			if(i == pivo) {
				System.out.println("pop: " + valor);
				pivo += 4;
			}
			if(i % 2 != 0) {
				pilhaFinal.push(valor);
			}
		}
		
		
		for(int i = 0; i < 5; i++) {
			try {
				System.out.println(pilhaFinal.pop());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}


