    /*
     * Peguei de um trabalho que participei em outro semestre
     * */
public class MergeSort  {
	private int[] numeros;
	private int[] aux;

	private int tamanho;
	
	/**
	 * Contador para troca e comparações
	 */
	int troca, compara;

	private String nome = "MERGE SORT";

	
	/**
	 * Metodo recebe valores para ordenar
	 * @param values int[]
	 */
	public int[] sort(int[] values) {
		this.numeros = values;
		tamanho = values.length;
		this.aux = new int[tamanho];
		/**
		 *  chama metodo de ordenação mergeSorte
		 *  merfeSorte(inicio, fim)
		 */
		mergeSort(0, tamanho - 1);
		
		return numeros;
	}

	/**
	 * metodo de ordenação Merge
	 * Dividir para conquistar
	 * Divide os elementos até está ordenado ou seja até conter apenas um elemento
	 * @param inicio numero da posição inicial da ordenação
	 * @param fim numero da posição final da ordenação
	 */
	private void mergeSort(int inicio, int fim) {
		// verificar se inicio é menor que o fim, ainda está desordenado
		if (inicio < fim) {
			// divide ao meio a quantidade de elementos
			int meio = inicio + (fim - inicio) / 2;
			// chama o mergeSorte do inicio até o meio, ou seja lado esquerdo
			mergeSort(inicio, meio);
			// chame o mergeSorte do meio até o fim, ou seja lado direito
			mergeSort(meio + 1, fim);
			// Compara lado esquerdo com lado direito
			merge(inicio, meio, fim);
		}
	}


	/**
	 * Metodo merge
	 * @param inicio passa posição inicial para comparação
	 * @param meio   passa posição do meio para comparação do inico ate o meio e do meio ate o fim
	 * @param fim    passa posição fim para comparação
	 */
	private void merge(int inicio, int meio, int fim) {

		// faz uma copia dos lados para um vetor auxiliar
		for (int i = inicio; i <= fim; i++) {
			aux[i] = numeros[i];
		}

		int i = inicio;
		int j = meio + 1;
		int k = inicio;
		
		// Mover os menores valores para traz
		while (i <= meio && j <= fim) {
			compara++;
			if (aux[i] <= aux[j]) {
				numeros[k] = aux[i];
				i++;
			} else {
				troca++;
				numeros[k] = aux[j];
				j++;
			}
			k++;
		}
		
		// Move o restante dos valores para traz
		while (i <= meio) {
			numeros[k] = aux[i];
			k++;
			i++;
		}

	}
	
	public String getNome() {
		return nome;
	}
	
	public int getTroca() {
		return troca;
	}

	public int getCompara() {
		return compara;
	}


}
