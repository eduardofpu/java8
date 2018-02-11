package javaoit8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import javax.print.attribute.standard.DateTimeAtCompleted;

public class Datas {
	
	public static void main(String[] args) {
		
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		
		LocalDate copa = LocalDate.of(2022, Month.JANUARY, 5);
		
		int anos = copa.getYear() - hoje.getYear();
		
		System.out.println("Faltam "+anos + " anos");
		
		
		Period periodo = Period.between(hoje, copa);
		
		System.out.println(periodo.getDays());
		
		//proxima copa
		LocalDate proximaCopa = copa.plusYears(4);
		
		System.out.println(proximaCopa);
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String valorFormatado = proximaCopa.format(formatador);
		
		System.out.println(valorFormatado);
		
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
		
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora.format(format));
		
		
		//mostra hora e minutos escolhido
		LocalTime intervalo = LocalTime.of(15,30);
		
		System.out.println(intervalo);
		
		
				
		
		
	}

}
