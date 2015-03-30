package menjacnica;

import java.util.GregorianCalendar;

import menjacnica.interfejsi.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {

	public void dodajKurs (Kurs kurs) {
		if (kurs == null)
			throw new RuntimeException("Kurs ne sme imati null vrednost");
		
	}
	
	public void obrisiKurs (Kurs kurs){
		
	}
	public Kurs vratiKurs (String skraceniNaziv, GregorianCalendar datum) {
		return null;
	}
}
