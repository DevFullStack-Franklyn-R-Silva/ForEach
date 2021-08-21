package application;

public class Program {

	public static void main(String[] args) {

		String[] vetor = new String[] { "Maria, Bob, Max" };

		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		for(String nomes : vetor) {
			System.out.println(nomes);
		}
	}

}
