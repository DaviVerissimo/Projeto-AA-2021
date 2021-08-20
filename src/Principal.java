import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int tam10 = 10;
		int tam100 = 100;
		int tam1000 = 1000;
		int tam10000 = 10000;
		int tam100000 = 100000;
		int tam1000000 = 1000000;
		Sequencia geradorDeSequencias = new Sequencia();
		Persistencia persistencia = new Persistencia();
		Algoritmo algoritmo = new Algoritmo();

		// gerando sequencias aleatorias
		if (!persistencia.isExiste("sequenciasAleatorias", "sequenciaTam10")) {
			int[] lista = Conversor.convertLongToInt(geradorDeSequencias.gerarSequenciaAleatoria(tam10));
			persistencia.salvar(lista, "sequenciasAleatorias", "sequenciaTam10");
		}
		
		if (!persistencia.isExiste("sequenciasAleatorias", "sequenciaTam100")) {
			int[] lista = Conversor.convertLongToInt(geradorDeSequencias.gerarSequenciaAleatoria(tam100));
			lista = geradorDeSequencias.removeRepetidos(lista);
			persistencia.salvar(lista, "sequenciasAleatorias", "sequenciaTam100");
		}
		
		if (!persistencia.isExiste("sequenciasAleatorias", "sequenciaTam1000")) {
			int[] lista = Conversor.convertLongToInt(geradorDeSequencias.gerarSequenciaAleatoria(tam1000));
			lista = geradorDeSequencias.removeRepetidos(lista);
			persistencia.salvar(lista, "sequenciasAleatorias", "sequenciaTam1000");
		}
		
		if (!persistencia.isExiste("sequenciasAleatorias", "sequenciaTam10000")) {
			int[] lista = Conversor.convertLongToInt(geradorDeSequencias.gerarSequenciaAleatoria(tam10000));
			lista = geradorDeSequencias.removeRepetidos(lista);
			persistencia.salvar(lista, "sequenciasAleatorias", "sequenciaTam10000");
		}
		
		if (!persistencia.isExiste("sequenciasAleatorias", "sequenciaTam100000")) {
			int[] lista = Conversor.convertLongToInt(geradorDeSequencias.gerarSequenciaAleatoria(tam100000));
			lista = geradorDeSequencias.removeRepetidos(lista);
			persistencia.salvar(lista, "sequenciasAleatorias", "sequenciaTam100000");
		}
		
		if (!persistencia.isExiste("sequenciasAleatorias", "sequenciaTam1000000")) {
			int[] lista = Conversor.convertLongToInt(geradorDeSequencias.gerarSequenciaAleatoria(tam1000000));
			lista = geradorDeSequencias.removeRepetidos(lista);
			persistencia.salvar(lista, "sequenciasAleatorias", "sequenciaTam1000000");
		}
		// gerando sequencias quase ordenadas
		if (!persistencia.isExiste("sequenciasQuaseOrdenadas", "sequenciaTam10")) {
			int[] lista = (int[]) persistencia.recuperar("sequenciasAleatorias", "sequenciaTam10");
			lista = algoritmo.heap_sort(lista);
			persistencia.salvar(lista, "sequenciasQuaseOrdenadas", "sequenciaTam10");
		}
		
		if (!persistencia.isExiste("sequenciasQuaseOrdenadas", "sequenciaTam100")) {
			int[] lista = (int[]) persistencia.recuperar("sequenciasAleatorias", "sequenciaTam100");
			lista = algoritmo.heap_sort(lista);
			persistencia.salvar(lista, "sequenciasQuaseOrdenadas", "sequenciaTam100");
		}
		
		if (!persistencia.isExiste("sequenciasQuaseOrdenadas", "sequenciaTam1000")) {
			int[] lista = (int[]) persistencia.recuperar("sequenciasAleatorias", "sequenciaTam1000");
			lista = algoritmo.heap_sort(lista);
			persistencia.salvar(lista, "sequenciasQuaseOrdenadas", "sequenciaTam1000");
		}
		
		if (!persistencia.isExiste("sequenciasQuaseOrdenadas", "sequenciaTam10000")) {
			int[] lista = (int[]) persistencia.recuperar("sequenciasAleatorias", "sequenciaTam10000");
			lista = algoritmo.heap_sort(lista);
			persistencia.salvar(lista, "sequenciasQuaseOrdenadas", "sequenciaTam10000");
		}
		
		if (!persistencia.isExiste("sequenciasQuaseOrdenadas", "sequenciaTam100000")) {
			int[] lista = geradorDeSequencias.gerarSequenciaSemiOrdenada(tam100000 - 1);
			persistencia.salvar(lista, "sequenciasQuaseOrdenadas", "sequenciaTam100000");
		}
		
		if (!persistencia.isExiste("sequenciasQuaseOrdenadas", "sequenciaTam1000000")) {
			int[] lista = geradorDeSequencias.gerarSequenciaSemiOrdenada(tam1000000 - 1);
			persistencia.salvar(lista, "sequenciasQuaseOrdenadas", "sequenciaTam1000000");
		}
		
		//geramdo sequencias ordenadas
		
		if (!persistencia.isExiste("sequenciasOrdenadas", "sequenciaTam10")) {
			int[] lista = (int[]) geradorDeSequencias.gerarSequenciaOrdenada(tam10);
			persistencia.salvar(lista, "sequenciasOrdenadas", "sequenciaTam10");
		}
		
		if (!persistencia.isExiste("sequenciasOrdenadas", "sequenciaTam100")) {
			int[] lista = (int[]) geradorDeSequencias.gerarSequenciaOrdenada(tam100);
			persistencia.salvar(lista, "sequenciasOrdenadas", "sequenciaTam100");
		}
		
		if (!persistencia.isExiste("sequenciasOrdenadas", "sequenciaTam1000")) {
			int[] lista = (int[]) geradorDeSequencias.gerarSequenciaOrdenada(tam1000);
			persistencia.salvar(lista, "sequenciasOrdenadas", "sequenciaTam1000");
		}
		
		if (!persistencia.isExiste("sequenciasOrdenadas", "sequenciaTam10000")) {
			int[] lista = (int[]) geradorDeSequencias.gerarSequenciaOrdenada(tam10000);
			persistencia.salvar(lista, "sequenciasOrdenadas", "sequenciaTam10000");
		}
		
		if (!persistencia.isExiste("sequenciasOrdenadas", "sequenciaTam100000")) {
			int[] lista = (int[]) geradorDeSequencias.gerarSequenciaOrdenada(tam100000);
			persistencia.salvar(lista, "sequenciasOrdenadas", "sequenciaTam100000");
		}
		
		if (!persistencia.isExiste("sequenciasOrdenadas", "sequenciaTam1000000")) {
			int[] lista = (int[]) geradorDeSequencias.gerarSequenciaOrdenada(tam1000000);
			persistencia.salvar(lista, "sequenciasOrdenadas", "sequenciaTam1000000");
		}
		
		//gerando sequencias inversamente ordenadas
		if (!persistencia.isExiste("sequenciasinversamenteOrdenadas", "sequenciaTam10")) {
			int[] lista = (int[]) geradorDeSequencias.gerarSequenciaOrdenada(tam10);
			persistencia.salvar(lista, "sequenciasinversamenteOrdenadas", "sequenciaTam10");
		}
		
		if (!persistencia.isExiste("sequenciasinversamenteOrdenadas", "sequenciaTam100")) {
			int[] lista = (int[]) geradorDeSequencias.gerarSequenciaOrdenada(tam100);
			persistencia.salvar(lista, "sequenciasinversamenteOrdenadas", "sequenciaTam100");
		}
		
		if (!persistencia.isExiste("sequenciasinversamenteOrdenadas", "sequenciaTam1000")) {
			int[] lista = (int[]) geradorDeSequencias.gerarSequenciaOrdenada(tam1000);
			persistencia.salvar(lista, "sequenciasinversamenteOrdenadas", "sequenciaTam1000");
		}
		
		if (!persistencia.isExiste("sequenciasinversamenteOrdenadas", "sequenciaTam10000")) {
			int[] lista = (int[]) geradorDeSequencias.gerarSequenciaOrdenada(tam10000);
			persistencia.salvar(lista, "sequenciasinversamenteOrdenadas", "sequenciaTam10000");
		}
		
		if (!persistencia.isExiste("sequenciasinversamenteOrdenadas", "sequenciaTam100000")) {
			int[] lista = (int[]) geradorDeSequencias.gerarSequenciaOrdenada(tam100000);
			persistencia.salvar(lista, "sequenciasinversamenteOrdenadas", "sequenciaTam100000");
		}
		
		if (!persistencia.isExiste("sequenciasinversamenteOrdenadas", "sequenciaTam1000000")) {
			int[] lista = (int[]) geradorDeSequencias.gerarSequenciaOrdenada(tam1000000);
			persistencia.salvar(lista, "sequenciasinversamenteOrdenadas", "sequenciaTam1000000");
		}
		
		//ordenando com bolha
		
		//teste com sequencias aleatorias
		
		
		int[] listaTam10 = (int[]) persistencia.recuperar("sequenciasAleatorias", "sequenciaTam10");
		for (int i = 0; i <= 30; i++) {
			if (!persistencia.isExiste("bolhaContadores", "sequenciaAleatoriaTam10 teste" + i)) {
				long inicio = System.currentTimeMillis();
				algoritmo.bubbleSortOpt(listaTam10);
				long fim = System.currentTimeMillis();
				long intervalo = fim - inicio;
				persistencia.salvar("comparator = " +  algoritmo.getComparator() +
						" trocaDeRegistros = " + algoritmo.getTrocaDeRegistros() + 
						"tempo decorrido = " + intervalo
				, "bolhaContadores", "sequenciaAleatoriaTam10 teste" + i);
			}
		}
		algoritmo.reset();
		
		int[] listaTam100 = (int[]) persistencia.recuperar("sequenciasAleatorias", "sequenciaTam100");
		for (int i = 0; i <= 30; i++) {
			if (!persistencia.isExiste("bolhaContadores", "sequenciaAleatoriaTam100 teste" + i)) {
				long inicio = System.currentTimeMillis();
				algoritmo.bubbleSortOpt(listaTam100);
				long fim = System.currentTimeMillis();
				long intervalo = fim - inicio;
				persistencia.salvar("comparator = " +  algoritmo.getComparator() +
						" trocaDeRegistros = " + algoritmo.getTrocaDeRegistros() + 
						"tempo decorrido = " + intervalo
				, "bolhaContadores", "sequenciaAleatoriaTam100 teste" + i);
			}
		}
		algoritmo.reset();
		
		int[] listaTam1000 = (int[]) persistencia.recuperar("sequenciasAleatorias", "sequenciaTam1000");
		for (int i = 0; i <= 30; i++) {
			if (!persistencia.isExiste("bolhaContadores", "sequenciaAleatoriaTam1000 teste" + i)) {
				long inicio = System.currentTimeMillis();
				algoritmo.bubbleSortOpt(listaTam1000);
				long fim = System.currentTimeMillis();
				long intervalo = fim - inicio;
				persistencia.salvar("comparator = " +  algoritmo.getComparator() +
						" trocaDeRegistros = " + algoritmo.getTrocaDeRegistros() + 
						"tempo decorrido = " + intervalo
				, "bolhaContadores", "sequenciaAleatoriaTam1000 teste" + i);
			}
		}
		algoritmo.reset();
		
		int[] listaTam10000 = (int[]) persistencia.recuperar("sequenciasAleatorias", "sequenciaTam10000");
		for (int i = 0; i <= 30; i++) {
			if (!persistencia.isExiste("bolhaContadores", "sequenciaAleatoriaTam10000 teste" + i)) {
				long inicio = System.currentTimeMillis();
				algoritmo.bubbleSortOpt(listaTam10000);
				long fim = System.currentTimeMillis();
				long intervalo = fim - inicio;
				persistencia.salvar("comparator = " +  algoritmo.getComparator() +
						" trocaDeRegistros = " + algoritmo.getTrocaDeRegistros() + 
						"tempo decorrido = " + intervalo
				, "bolhaContadores", "sequenciaAleatoriaTam10000 teste" + i);
			}
		}
		algoritmo.reset();
		
		int[] listaTam100000 = (int[]) persistencia.recuperar("sequenciasAleatorias", "sequenciaTam100000");
		for (int i = 0; i <= 30; i++) {
			if (!persistencia.isExiste("bolhaContadores", "sequenciaAleatoriaTam100000 teste" + i)) {
				long inicio = System.currentTimeMillis();
				algoritmo.bubbleSortOpt(listaTam100000);
				long fim = System.currentTimeMillis();
				long intervalo = fim - inicio;
				persistencia.salvar("comparator = " +  algoritmo.getComparator() +
						" trocaDeRegistros = " + algoritmo.getTrocaDeRegistros() + 
						"tempo decorrido = " + intervalo
				, "bolhaContadores", "sequenciaAleatoriaTam100000 teste" + i);
			}
		}
		algoritmo.reset();
		
		int[] listaTam1000000 = (int[]) persistencia.recuperar("sequenciasAleatorias", "sequenciaTam1000000");
		for (int i = 0; i <= 30; i++) {
			if (!persistencia.isExiste("bolhaContadores", "sequenciaAleatoriaTam1000000 teste" + i)) {
				long inicio = System.currentTimeMillis();
				algoritmo.bubbleSortOpt(listaTam1000000);
				long fim = System.currentTimeMillis();
				long intervalo = fim - inicio;
				persistencia.salvar("comparator = " +  algoritmo.getComparator() +
						" trocaDeRegistros = " + algoritmo.getTrocaDeRegistros() + 
						"tempo decorrido = " + intervalo
				, "bolhaContadores", "sequenciaAleatoriaTam1000000 teste" + i);
			}
		}
		algoritmo.reset();
		
//		//teste com sequencias quase ordenadas
		
		 listaTam10 = (int[]) persistencia.recuperar("sequenciasQuaseOrdenadas", "sequenciaTam10");
			for (int i = 0; i <= 30; i++) {
				if (!persistencia.isExiste("bolhaContadores", "sequenciasQuaseOrdenadasTam10 teste" + i)) {
					long inicio = System.currentTimeMillis();
					algoritmo.bubbleSortOpt(listaTam10);
					long fim = System.currentTimeMillis();
					long intervalo = fim - inicio;
					persistencia.salvar("comparator = " +  algoritmo.getComparator() +
							" trocaDeRegistros = " + algoritmo.getTrocaDeRegistros() + 
							"tempo decorrido = " + intervalo
					, "bolhaContadores", "sequenciasQuaseOrdenadasTam10 teste" + i);
				}
			}
			algoritmo.reset();
		
		listaTam100 = (int[]) persistencia.recuperar("sequenciasQuaseOrdenadas", "sequenciaTam100");
			for (int i = 0; i <= 30; i++) {
				if (!persistencia.isExiste("bolhaContadores", "sequenciasQuaseOrdenadasTam100 teste" + i)) {
					long inicio = System.currentTimeMillis();
					algoritmo.bubbleSortOpt(listaTam100);
					long fim = System.currentTimeMillis();
					long intervalo = fim - inicio;
					persistencia.salvar("comparator = " +  algoritmo.getComparator() +
							" trocaDeRegistros = " + algoritmo.getTrocaDeRegistros() + 
							"tempo decorrido = " + intervalo
					, "bolhaContadores", "sequenciasQuaseOrdenadasTam100 teste" + i);
				}
			}
			algoritmo.reset();
		
		listaTam1000 = (int[]) persistencia.recuperar("sequenciasQuaseOrdenadas", "sequenciaTam1000");
			for (int i = 0; i <= 30; i++) {
				if (!persistencia.isExiste("bolhaContadores", "sequenciasQuaseOrdenadasTam1000 teste" + i)) {
					long inicio = System.currentTimeMillis();
					algoritmo.bubbleSortOpt(listaTam1000);
					long fim = System.currentTimeMillis();
					long intervalo = fim - inicio;
					persistencia.salvar("comparator = " +  algoritmo.getComparator() +
							" trocaDeRegistros = " + algoritmo.getTrocaDeRegistros() + 
							"tempo decorrido = " + intervalo
					, "bolhaContadores", "sequenciasQuaseOrdenadasTam1000 teste" + i);
				}
			}
			algoritmo.reset();

		listaTam10000 = (int[]) persistencia.recuperar("sequenciasQuaseOrdenadas", "sequenciaTam10000");
			for (int i = 0; i <= 30; i++) {
				if (!persistencia.isExiste("bolhaContadores", "sequenciasQuaseOrdenadasTam10000 teste" + i)) {
					long inicio = System.currentTimeMillis();
					algoritmo.bubbleSortOpt(listaTam10000);
					long fim = System.currentTimeMillis();
					long intervalo = fim - inicio;
					persistencia.salvar("comparator = " +  algoritmo.getComparator() +
							" trocaDeRegistros = " + algoritmo.getTrocaDeRegistros() + 
							"tempo decorrido = " + intervalo
					, "bolhaContadores", "sequenciasQuaseOrdenadasTam10000 teste" + i);
				}
			}
			algoritmo.reset();
		
		listaTam100000 = (int[]) persistencia.recuperar("sequenciasQuaseOrdenadas", "sequenciaTam100000");
			for (int i = 0; i <= 30; i++) {
				if (!persistencia.isExiste("bolhaContadores", "sequenciasQuaseOrdenadasTam100000 teste" + i)) {
					long inicio = System.currentTimeMillis();
					algoritmo.bubbleSortOpt(listaTam100000);
					long fim = System.currentTimeMillis();
					long intervalo = fim - inicio;
					persistencia.salvar("comparator = " +  algoritmo.getComparator() +
							" trocaDeRegistros = " + algoritmo.getTrocaDeRegistros() + 
							"tempo decorrido = " + intervalo
					, "bolhaContadores", "sequenciasQuaseOrdenadasTam100000 teste" + i);
				}
			}
			algoritmo.reset();
			
		listaTam1000000 = (int[]) persistencia.recuperar("sequenciasQuaseOrdenadas", "sequenciaTam1000000");
			for (int i = 0; i <= 30; i++) {
				if (!persistencia.isExiste("bolhaContadores", "sequenciasQuaseOrdenadasTam1000000 teste" + i)) {
					long inicio = System.currentTimeMillis();
					algoritmo.bubbleSortOpt(listaTam1000000);
					long fim = System.currentTimeMillis();
					long intervalo = fim - inicio;
					persistencia.salvar("comparator = " +  algoritmo.getComparator() +
							" trocaDeRegistros = " + algoritmo.getTrocaDeRegistros() + 
							"tempo decorrido = " + intervalo
					, "bolhaContadores", "sequenciasQuaseOrdenadasTam1000000 teste" + i);
				}
			}
			
			algoritmo.reset();
			
//			//teste com sequencias ordenadas
		 
			listaTam10 = (int[]) persistencia.recuperar("sequenciasOrdenadas", "sequenciaTam10");
			 for (int i = 0; i <= 30; i++) {
					if (!persistencia.isExiste("bolhaContadores", "sequenciasOrdenadasTam10 teste" + i)) {
						long inicio = System.currentTimeMillis();
						algoritmo.bubbleSortOpt(listaTam10);
						long fim = System.currentTimeMillis();
						long intervalo = fim - inicio;
						persistencia.salvar("comparator = " +  algoritmo.getComparator() +
								" trocaDeRegistros = " + algoritmo.getTrocaDeRegistros() + 
								"tempo decorrido = " + intervalo
						, "bolhaContadores", "sequenciasOrdenadasTam10 teste" + i);
					}
				}
				algoritmo.reset();
			
			listaTam100 = (int[]) persistencia.recuperar("sequenciasOrdenadas", "sequenciaTam100");
				for (int i = 0; i <= 30; i++) {
					if (!persistencia.isExiste("bolhaContadores", "sequenciasOrdenadasTam100 teste" + i)) {
						long inicio = System.currentTimeMillis();
						algoritmo.bubbleSortOpt(listaTam100);
						long fim = System.currentTimeMillis();
						long intervalo = fim - inicio;
						persistencia.salvar("comparator = " +  algoritmo.getComparator() +
								" trocaDeRegistros = " + algoritmo.getTrocaDeRegistros() + 
								"tempo decorrido = " + intervalo
						, "bolhaContadores", "sequenciasOrdenadasTam100 teste" + i);
					}
				}
				algoritmo.reset();
				
			listaTam1000 = (int[]) persistencia.recuperar("sequenciasOrdenadas", "sequenciaTam1000");
				for (int i = 0; i <= 30; i++) {
					if (!persistencia.isExiste("bolhaContadores", "sequenciasOrdenadasTam1000 teste" + i)) {
						long inicio = System.currentTimeMillis();
						algoritmo.bubbleSortOpt(listaTam1000);
						long fim = System.currentTimeMillis();
						long intervalo = fim - inicio;
						persistencia.salvar("comparator = " +  algoritmo.getComparator() +
								" trocaDeRegistros = " + algoritmo.getTrocaDeRegistros() + 
								"tempo decorrido = " + intervalo
						, "bolhaContadores", "sequenciasOrdenadasTam1000 teste" + i);
					}
				}
				algoritmo.reset();
//				
				listaTam10000 = (int[]) persistencia.recuperar("sequenciasOrdenadas", "sequenciaTam10000");
				for (int i = 0; i <= 30; i++) {
					if (!persistencia.isExiste("bolhaContadores", "sequenciasOrdenadasTam10000 teste" + i)) {
						long inicio = System.currentTimeMillis();
						algoritmo.bubbleSortOpt(listaTam10000);
						long fim = System.currentTimeMillis();
						long intervalo = fim - inicio;
						persistencia.salvar("comparator = " +  algoritmo.getComparator() +
								" trocaDeRegistros = " + algoritmo.getTrocaDeRegistros() + 
								"tempo decorrido = " + intervalo
						, "bolhaContadores", "sequenciasOrdenadasTam10000 teste" + i);
					}
				}
				algoritmo.reset();
			
				listaTam100000 = (int[]) persistencia.recuperar("sequenciasOrdenadas", "sequenciaTam100000");
				for (int i = 0; i <= 30; i++) {
					if (!persistencia.isExiste("bolhaContadores", "sequenciasOrdenadasTam100000 teste" + i)) {
						long inicio = System.currentTimeMillis();
						algoritmo.bubbleSortOpt(listaTam100000);
						long fim = System.currentTimeMillis();
						long intervalo = fim - inicio;
						persistencia.salvar("comparator = " +  algoritmo.getComparator() +
								" trocaDeRegistros = " + algoritmo.getTrocaDeRegistros() + 
								"tempo decorrido = " + intervalo
						, "bolhaContadores", "sequenciasOrdenadasTam100000 teste" + i);
					}
				}
				algoritmo.reset();
//				
			listaTam1000000 = (int[]) persistencia.recuperar("sequenciasOrdenadas", "sequenciaTam1000000");
				for (int i = 0; i <= 30; i++) {
					if (!persistencia.isExiste("bolhaContadores", "sequenciasOrdenadasTam1000000 teste" + i)) {
						long inicio = System.currentTimeMillis();
						algoritmo.bubbleSortOpt(listaTam1000000);
						long fim = System.currentTimeMillis();
						long intervalo = fim - inicio;
						persistencia.salvar("comparator = " +  algoritmo.getComparator() +
								" trocaDeRegistros = " + algoritmo.getTrocaDeRegistros() + 
								"tempo decorrido = " + intervalo
						, "bolhaContadores", "sequenciasOrdenadasTam1000000 teste" + i);
					}
				}
				
				algoritmo.reset();
			
//				//teste com sequencias inversamente ordenadas.

				 listaTam10 = (int[]) persistencia.recuperar("sequenciasInversamenteOrdenadas", "sequenciaTam10");
				 for (int i = 0; i <= 30; i++) {
						if (!persistencia.isExiste("bolhaContadores", "sequenciasInversamenteOrdenadasTam10 teste" + i)) {
							long inicio = System.currentTimeMillis();
							algoritmo.bubbleSortOpt(listaTam10);
							long fim = System.currentTimeMillis();
							long intervalo = fim - inicio;
							persistencia.salvar("comparator = " +  algoritmo.getComparator() +
									" trocaDeRegistros = " + algoritmo.getTrocaDeRegistros() + 
									"tempo decorrido = " + intervalo
							, "bolhaContadores", "sequenciasInversamenteOrdenadasTam10 teste" + i);
						}
					}
					algoritmo.reset();
					
				 listaTam100 = (int[]) persistencia.recuperar("sequenciasInversamenteOrdenadas", "sequenciaTam100");
					for (int i = 0; i <= 30; i++) {
						if (!persistencia.isExiste("bolhaContadores", "sequenciasInversamenteOrdenadasTam100 teste" + i)) {
							long inicio = System.currentTimeMillis();
							algoritmo.bubbleSortOpt(listaTam100);
							long fim = System.currentTimeMillis();
							long intervalo = fim - inicio;
							persistencia.salvar("comparator = " +  algoritmo.getComparator() +
									" trocaDeRegistros = " + algoritmo.getTrocaDeRegistros() + 
									"tempo decorrido = " + intervalo
							, "bolhaContadores", "sequenciasInversamenteOrdenadasTam100 teste" + i);
						}
					}
					algoritmo.reset();
					
				 listaTam1000 = (int[]) persistencia.recuperar("sequenciasInversamenteOrdenadas", "sequenciaTam1000");
					for (int i = 0; i <= 30; i++) {
						if (!persistencia.isExiste("bolhaContadores", "sequenciasInversamenteOrdenadasTam1000 teste" + i)) {
							long inicio = System.currentTimeMillis();
							algoritmo.bubbleSortOpt(listaTam1000);
							long fim = System.currentTimeMillis();
							long intervalo = fim - inicio;
							persistencia.salvar("comparator = " +  algoritmo.getComparator() +
									" trocaDeRegistros = " + algoritmo.getTrocaDeRegistros() + 
									"tempo decorrido = " + intervalo
							, "bolhaContadores", "sequenciasInversamenteOrdenadasTam1000 teste" + i);
						}
					}
					algoritmo.reset();
					
				 listaTam10000 = (int[]) persistencia.recuperar("sequenciasInversamenteOrdenadas", "sequenciaTam10000");
					for (int i = 0; i <= 30; i++) {
						if (!persistencia.isExiste("bolhaContadores", "sequenciasInversamenteOrdenadasTam10000 teste" + i)) {
							long inicio = System.currentTimeMillis();
							algoritmo.bubbleSortOpt(listaTam10000);
							long fim = System.currentTimeMillis();
							long intervalo = fim - inicio;
							persistencia.salvar("comparator = " +  algoritmo.getComparator() +
									" trocaDeRegistros = " + algoritmo.getTrocaDeRegistros() + 
									"tempo decorrido = " + intervalo
							, "bolhaContadores", "sequenciasInversamenteOrdenadasTam10000 teste" + i);
						}
					}
					algoritmo.reset();
					
				 listaTam100000 = (int[]) persistencia.recuperar("sequenciasInversamenteOrdenadas", "sequenciaTam100000");
					for (int i = 0; i <= 30; i++) {
						if (!persistencia.isExiste("bolhaContadores", "sequenciasInversamenteOrdenadasTam100000 teste" + i)) {
							long inicio = System.currentTimeMillis();
							algoritmo.bubbleSortOpt(listaTam100000);
							long fim = System.currentTimeMillis();
							long intervalo = fim - inicio;
							persistencia.salvar("comparator = " +  algoritmo.getComparator() +
									" trocaDeRegistros = " + algoritmo.getTrocaDeRegistros() + 
									"tempo decorrido = " + intervalo
							, "bolhaContadores", "sequenciasInversamenteOrdenadasTam100000 teste" + i);
						}
					}
					algoritmo.reset();
					
				 listaTam1000000 = (int[]) persistencia.recuperar("sequenciasInversamenteOrdenadas", "sequenciaTam1000000");
					for (int i = 0; i <= 30; i++) {
						if (!persistencia.isExiste("bolhaContadores", "sequenciasInversamenteOrdenadasTam1000000 teste" + i)) {
							long inicio = System.currentTimeMillis();
							algoritmo.bubbleSortOpt(listaTam1000000);
							long fim = System.currentTimeMillis();
							long intervalo = fim - inicio;
							persistencia.salvar("comparator = " +  algoritmo.getComparator() +
									" trocaDeRegistros = " + algoritmo.getTrocaDeRegistros() + 
									"tempo decorrido = " + intervalo
							, "bolhaContadores", "sequenciasInversamenteOrdenadasTam1000000 teste" + i);
						}
					}
					
					algoritmo.reset();

		JOptionPane.showMessageDialog(null, "Fim!");
	}
	
}
