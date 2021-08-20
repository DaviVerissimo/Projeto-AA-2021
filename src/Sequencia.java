
public class Sequencia {
	
	/**Gera sequencias aleatorias com 15 digitos.
	 * @param t
	 * @return
	 */
	public static long[] gerarSequenciaAleatoria(int t) { 
		long[] v = new long[t];
		for(int i = 0; i < t; i++) {
			
			v[i] = 100000000000000l + (long)(Math.random()*900000000000000l);
		}
		return v;
	}
	
	public int[] gerarSequenciaOrdenada(int tamanho) {
		int[] lista = new int[tamanho];
		for (int i = 1; i <= tamanho - 1; i++) {
			lista[i] = i;
		}
		return lista;
	}
	
	public int[] gerarSequenciaSemiOrdenada(int tamanho) {
		int[] lista = new int[tamanho];
		for (int i = 1; i <= tamanho - 1; i++) {
			lista[0] = 1000000; 
			lista[i] = i;
		}
		return lista;
	}
	
	public int[] gerarSequenciasInvertidas(int[] lista) {
		int[] listaInvertida = new int[lista.length];
		for (int i = 0; i <= lista.length; i++) {
			listaInvertida[i] = lista[lista.length - i];
		}
		return listaInvertida;
	}
	
	/**remove e substitui repetidos recomerçando a verificação por novos repetidos.
	 * @param lista
	 * @return
	 */
	public int[] removeRepetidos(int[] lista) {
		int bonus = 1500000;
		for (int i = 0;i <= lista.length -1; i++) {
			int numeroVerificado = lista[i];
			for (int j = 0; j <= lista.length - 1 ; j++) {
				if (numeroVerificado == lista[j]) {
					int aux = lista[j];
					lista[j] = aux + bonus;
					bonus++;
					j = 0;
				}
			}
		}
		return lista;
	}
	
	
	

}
