package it.polito.tdp.libretto;

import java.time.LocalDate;
import java.util.*;

public class Libretto {

	private List<Voto> voti;
	
	public Libretto(){
		this.voti = new ArrayList<Voto>();
	}
	
	public void add(int voto, String corso, LocalDate data) {
		
	}
	
	/**
	 * Aggiunte un nuovo voto al libretto
	 * @param v il {@link Voto} da aggiungere
	 */
	public void add(Voto v) { //pi� efficiente perch� se cambia struttura voto qui rimane invariato.
		voti.add(v);
	}
	
	/**
	 * Seleziona il sottoinsieme di voti che hanno il punteggio specificato
	 * 
	 * @param punti punteggio da ricerca
	 * @return lista di {@link Voto} aventi quel punteggio
	 */
	public List<Voto> cercaVoti(int punti){
		List<Voto> result = new ArrayList<Voto>();
		for(Voto v:this.voti) {
			if(v.getPunti()==punti) {
				result.add(v);
			}
		}
		return result;
	}
}
