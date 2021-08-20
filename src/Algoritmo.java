import java.util.ArrayList;
import java.util.Arrays;

public class Algoritmo {
		private int comparator;
		private int trocaDeRegistros;
		
	
	/* Retirado de:
	 * 
	 * https://www.blogcyberini.com/2018/02/bubble-sort.html
	 * 
	 * */
    public void bubbleSortOpt(int[] a){
        if(a == null){
            throw new NullPointerException("The array doesn't exist.");
        }
        long inicio = System.currentTimeMillis();
        boolean flag = true;
        for(int i = 0; i < a.length - 1 && flag; i++){
            flag = false; //quando não há trocas, flag continuará false
            for(int j = 0; j < a.length - i - 1; j++){
            	this.comparator++;
                if(a[j] > a[j + 1]){
                	trocaDeRegistros++;
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp; 
                    flag = true; //troca realizada, flag true
                }
            }
        }
    }

	
    /*Retirado da Apostila com pivo para ser aleatorio.*/
	public void quick_sortRandomElement(int[] v, int i, int f) {
		//int pivo = (v[i] + v[f])/2;
		int pivo = (int) ( 1 + Math.random() * v.length );
		int e = i;
		int d = f;
		while (e <= d) {
		while (e <= f && v[e] < pivo)
		e++;
		while (d >= i && v[d] > pivo)
		d--;
		if (e <= d) {
		int aux = v[e];
		v[e] = v[d];
		v[d] = aux;
		e++;
		d--;
		}//endif
		}//endwhile
		if (e < f)
			quick_sortRandomElement(v, e, f);
		if (d > i)
			quick_sortRandomElement(v, i, d);
		}//endfuncao
			
    /*Obtido em 
     * https://www.youtube.com/watch?v=PrR3nfq9wSY&list=WL&index=99&t=588s 
     * */
	public void quick_sortPrimaryElement(int[] v, int esq, int dir) {
		if(esq < dir) {
			int j = separar(v, esq, dir);
			quick_sortPrimaryElement(v, esq, j - 1);
			quick_sortPrimaryElement(v, j + 1, dir);
		}
	}
	
	private int separar(int[] v, int esq, int dir) {
		int i = esq + 1;
		int j = dir;
		int pivo = v[0];
		while(i <=j) {
			if(v[i] <= pivo) {
				i++;
			}
			else if(v[j] > pivo) {
				j--;
			}
			else if(i <= j) {
				trocar(v, i, j);
				i++;
				j--;
			}
		}
		trocar(v, esq, j);
		return j;
	}

	private void trocar(int[] v, int i, int j) {
		int aux = v[i];
		v[i] = v[j];
		v[j] = aux;
	}


	/*Retirado da apostila*/
	public void selecao_direta(int[] v) {
		for(int i = 0; i < v.length; i++) {
			//assumindo que o i-ésimo é o menor
			int indice_menor = i;
			//procurando o menor entre os restantes
			for(int j = i+1; j < v.length; j++) {
			if (v[j] < v[indice_menor])
			indice_menor = j;
			}//endfor
			//trocando o i-ésimo elemento e menor de posição
			int aux = v[i];
			v[i] = v[indice_menor];
			v[indice_menor] = aux;
			}
			}
	/*Retirado da apostila*/
	public int[] heap_sort(int[] v) {
		int f = v.length - 1;
		for(int i = f; i >=0; i--)
		construirHeap(v, i, f);
		while (f > 0) {
		int aux = v[f];
		v[f] = v[0];
		v[0] = aux;
		construirHeap(v, 0, --f);
		}
		return v;
		}
	
	public int[] construirHeap(int[] v, int i, int f) {
		while (i <= f) {
			int maior = i;
			int e = 2*i+1;
			int d = 2*i+2;
			if (e <= f && v[e] > v[maior])
			maior = e;
			if (d <= f && v[d] > v[maior])
			maior = d;
			if (maior != i) {
			int aux = v[maior];
			v[maior] = v[i];
			v[i] = aux;
			i = maior;
			} else {
			return v;
			}
			}
		return v;
			}

	
	/**
	 * Retirado da Apostila
	 * **/
    public void insertionSort(int[] v){
    	for(int i = 0; i < v.length-1; i++) {
    		int j = i+1;
    		int n = v[j];
    		while (j > 0 && n < v[j-1]) {
    			v[j] = v[j-1];
    			j--;
    			}//endwhile
    		v[j] = n;
    	}//endfor
    }//endfuncao

    /*
     * Peguei de um trabalho que participei em outro semestre
     * */
    public  void merge_Sort(int[] v, int i, int f) {
    	MergeSort mergesort = new MergeSort();
    	mergesort.sort(v);
    	
    	}
    

	/*Retorna o maior valor de umasequencia*/
	private int maior(int[] vetor) {
		int aux = vetor[0];
		for (int i = 0;i < vetor.length; i++) {
			if (vetor[i] > aux) {
				aux = vetor[i];
			}
		}
		return aux;
	}


	
	public int getComparator() {
		return comparator;
	}

	public void setComparator(int comparator) {
		this.comparator = comparator;
	}

	public int getTrocaDeRegistros() {
		return trocaDeRegistros;
	}

	public void setTrocaDeRegistros(int trocaDeRegistros) {
		this.trocaDeRegistros = trocaDeRegistros;
	}
	
	public void reset() {
		this.comparator = 0;
		this.trocaDeRegistros = 0;
	}
	

}
