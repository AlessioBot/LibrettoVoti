package it.polito.tdp.libretto;

import java.time.LocalDate;
import java.util.*;

public class TestLibretto {

	public static void main(String[] args) {

		Libretto libr = new Libretto();
		libr.add(new Voto(30,"Analisi 1",LocalDate.of(2017, 1, 15)));
		libr.add(new Voto(25,"Fisica 1",LocalDate.of(2018, 2, 25)));
		libr.add(new Voto(30,"Geome 1",LocalDate.of(2017, 1, 15)));
		libr.add(new Voto(28,"Analisi 2",LocalDate.of(2018, 2, 15)));
		libr.add(new Voto(26,"Fisica 2",LocalDate.of(2017, 1, 15)));
		libr.add(new Voto(30,"tdp",LocalDate.of(2019, 1, 25)));
		libr.add(new Voto(29,"po",LocalDate.of(2017, 1, 15)));
		libr.add(new Voto(28,"Ric Op",LocalDate.of(2017, 1, 15)));
		libr.add(new Voto(30,"pwr",LocalDate.of(2019, 6, 15)));
		
		List<Voto> venticinque = libr.cercaVoti(25);
		System.out.println(venticinque);
		
		Voto a1 = libr.cercaEsame("Analisi 1");
		Voto a3 = libr.cercaEsame("Analisi 3");
		System.out.println(a1);
		System.out.println(a3);
		
		Voto giusto = new Voto(30,"Geome 1",LocalDate.now());
		Voto sbagliato  = new Voto(28,"Geome 1",LocalDate.now());
		Voto mancante = new Voto(30,"Merendine",LocalDate.now());
		System.out.format("il voto %s é %s\n",giusto.toString(), libr.esisteGiaVoto(giusto));
		System.out.format("il voto %s é %s\n",sbagliato.toString(), libr.esisteGiaVoto(sbagliato));
		System.out.format("il voto %s é %s\n",mancante.toString(), libr.esisteGiaVoto(mancante));
		

	}

}
