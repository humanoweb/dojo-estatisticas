package br.com.humano.dojo.estatistica;

import java.util.Collections;
import java.util.List;

public class Estatisticas {
	
	public static int getMenorValor(List<Integer> valor) {
		return Collections.min(valor);
	}

	public static int getMaiorValor(List<Integer> valor) {
		return Collections.max(valor);
	}

	public static int getNumeroDeElementos(List<Integer> valores) {
		return valores.size();
	}

	public static double getMediaValores(List<Integer> valores) {
		int total = 0;
		int neElentos = valores.size();
		
		for (Integer valor : valores) {
			total = total + valor;
		}
		return (double)(total / neElentos);
	}
	
}
