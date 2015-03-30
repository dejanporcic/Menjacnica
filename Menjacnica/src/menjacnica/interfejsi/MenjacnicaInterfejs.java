package menjacnica.interfejsi;

import java.util.GregorianCalendar;

import menjacnica.Kurs;

public interface MenjacnicaInterfejs {

	public void dodajKurs (Kurs kurs);
	public void obrisiKurs (Kurs kurs);
	public Kurs vratiKurs (String skraceniNaziv, GregorianCalendar datum);
}
