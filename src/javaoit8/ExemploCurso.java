package javaoit8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.SynchronousQueue;
import java.util.stream.Collectors;
	

public class ExemploCurso {
		
	public static void main(String[] args) {
		
		List<Curso> cursos = new ArrayList<Curso>();
		
		cursos.add(new Curso("Pyton", 45));		
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		
		//O auto complite tem ainda algum problema com lambda e so escrever o codigo e ele compila corretamente
		//cursos.sort(Comparator.comparing(c -> c.getAlunos()));
		
		//method reference
		cursos.sort(Comparator.comparing(Curso::getAlunos));
		
		//cursos.forEach(System.out::println);		
		//cursos.forEach(c -> System.out.println(c.getNome()));
		
		//Filtrar todos os cursos que tem mais de 100 alunos
		//e possivel concatenar varios metodos para buscar objetos
		//cursos.stream()
		//.filter(c -> c.getAlunos() >= 100 )
		//.forEach(c -> System.out.println(c.getNome()));
		
		//.map(c -> c.getAlunos())
		//.forEach(total -> System.out.println(total));
		
		//.map(Curso::getAlunos)
		//.forEach(System.out::println);		
		
		//stream não pode ser colocado dentro de list
		/*int sum = cursos.stream()
		.filter(c -> c.getAlunos() >= 100 )		
		.mapToInt(Curso::getAlunos)		
		.sum();
		
		System.out.println(sum);*/
		
		
		/*Optional<Curso> optionalCurso = cursos.stream()
		.filter(c -> c.getAlunos() >= 100)
		.findAny();
		
		//se for maior ou igual a 1000 não devolve nada
		optionalCurso.ifPresent(c -> System.out.println(c.getNome()));
		*/
		//Curso curso = optionalCurso.orElse(null);
		//System.out.println(curso.getNome());
		
		/*cursos.stream()
				.filter(c -> c.getAlunos() >= 100)
				.findAny()					
				.ifPresent(c -> System.out.println(c.getNome()));*/
		
		
		/*cursos = cursos.stream()
				.filter(c -> c.getAlunos() >=100)
				.collect(Collectors.toList());
		
		cursos.stream().
		forEach(c -> System.out.println(c.getNome()));
				*/
		
		
		/*cursos.stream()
		.filter(c -> c.getAlunos() >=100)
		.collect(Collectors.toMap(
				
			c -> c.getNome(),
			c -> c.getAlunos()))
		
		.forEach((nome,alunos) -> System.out.println(nome+ " tem " +alunos + " alunos"));*/
		
		/*cursos.stream()
	    .mapToInt(c -> c.getAlunos())
	    .average();*/
		
		
		//roda com tread em paralelo
		cursos.parallelStream()
		.filter(c -> c.getAlunos() >=100)
		.collect(Collectors.toMap(
				
			c -> c.getNome(),
			c -> c.getAlunos()))
		
		.forEach((nome,alunos) -> System.out.println(nome+ " tem " +alunos + " alunos"));
		
	}	
	
	
}




