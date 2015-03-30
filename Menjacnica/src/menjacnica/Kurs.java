package menjacnica;

import java.util.GregorianCalendar;

public class Kurs {

	private Valuta valuta;
	private double srednjiKurs, prodajniKurs, kupovniKurs;
	private GregorianCalendar datum;
	public Valuta getValuta() {
		return valuta;
	}
	public double getSrednjiKurs() {
		return srednjiKurs;
	}
	public double getProdajniKurs() {
		return prodajniKurs;
	}
	public double getKupovniKurs() {
		return kupovniKurs;
	}
	public GregorianCalendar getDatum() {
		return datum;
	}
	public void setValuta(Valuta valuta) {
		this.valuta = valuta;
	}
	public void setSrednjiKurs(double srednjiKurs) {
		this.srednjiKurs = srednjiKurs;
	}
	public void setProdajniKurs(double prodajniKurs) {
		this.prodajniKurs = prodajniKurs;
	}
	public void setKupovniKurs(double kupovniKurs) {
		this.kupovniKurs = kupovniKurs;
	}
	public void setDatum(GregorianCalendar datum) {
		this.datum = datum;
	}
	
	
}
