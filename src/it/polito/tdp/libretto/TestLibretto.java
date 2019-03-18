package it.polito.tdp.libretto;

import java.time.LocalDate;

public class TestLibretto {

	public static void main(String[] args) {

		Libretto libr = new Libretto();
		libr.add(new Voto(30,"Analisi 1",LocalDate.of(2017, 1, 15)));
		libr.add(new Voto(21,"Fisica 1",LocalDate.of(2018, 2, 25)));
		libr.add(new Voto(30,"Geome 1",LocalDate.of(2017, 1, 15)));
		libr.add(new Voto(28,"Analisi 2",LocalDate.of(2018, 2, 15)));
		libr.add(new Voto(26,"Fisica 2",LocalDate.of(2017, 1, 15)));
		libr.add(new Voto(30,"tdp",LocalDate.of(2019, 1, 25)));
		libr.add(new Voto(29,"po",LocalDate.of(2017, 1, 15)));
		libr.add(new Voto(28,"Ric Op",LocalDate.of(2017, 1, 15)));
		libr.add(new Voto(30,"pwr",LocalDate.of(2019, 6, 15)));
		
		
		
		

	}

}
