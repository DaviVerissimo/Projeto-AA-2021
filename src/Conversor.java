
public class Conversor {
	public static int[] convertLongToInt(long[] lista) {
		int[] listaDeInteiros = new int[lista.length];
		for (int i = 0; i <lista.length;i++) {
			listaDeInteiros[i] = (int) lista[i];
		}
		
		return listaDeInteiros;
		}

}
