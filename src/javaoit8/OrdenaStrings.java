package javaoit8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");

		Comparator<String> comparador = new ComparadorPorTamanho();

		// ordenação
		// Collections.sort(palavras,comparador);
		// palavras.sort(comparador);

		/*
		 * palavras.sort((s1,s2)->{
		 * 
		 * if (s1.length() < s2.length()) { return -1; }
		 * 
		 * if (s1.length() > s2.length()) { return 1; }
		 * 
		 * return 0;
		 * 
		 * });
		 * 
		 */

		// Se tiver so um comando pode tirar as {} o return e o ;
		// O lambda consegue ser convertido para uma interface funcional
		//palavras.sort((s1, s2) ->Integer.compare(s1.length(), s2.length()));
		//System.out.println(palavras);
		
		
		//method reference
		//palavras.sort(Comparator.comparing(s -> s.length()));
		
		//dessa forma fica mais tipada
		palavras.sort(Comparator.comparing(String::length));
		
		
		
		

		/*
		 * for(String p : palavras) { System.out.println(p); }
		 */

		/*
		 * Consumer<String> consumidor = new ImprimeNaLinha();
		 * palavras.forEach(consumidor);
		 */
		
		/*Consumer<String> impressor = s -> System.out.println(s);
		palavras.forEach(impressor);*/

		// lambda com um argumento retorna um código consiso, enxuto e legível.
		//palavras.forEach(s -> System.out.println(s));
		
		palavras.forEach(System.out::println);
		
		
		//Executando uma thread
		new Thread(() -> System.out.println("Executando um Runnable")).start();

	}

}

class ImprimeNaLinha implements Consumer<String> {

	@Override
	public void accept(String s) {

		System.out.println(s);
	}

}

class ComparadorPorTamanho implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
		if (s1.length() < s2.length()) {
			return -1;
		}

		if (s1.length() > s2.length()) {
			return 1;
		}

		return 0;
	}
}
