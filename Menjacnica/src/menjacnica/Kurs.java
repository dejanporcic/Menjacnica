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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		long temp;
		temp = Double.doubleToLongBits(kupovniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(prodajniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(srednjiKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((valuta == null) ? 0 : valuta.hashCode());
		return result;
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Kurs other = (Kurs) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		if (Double.doubleToLongBits(kupovniKurs) != Double
				.doubleToLongBits(other.kupovniKurs))
			return false;
		if (Double.doubleToLongBits(prodajniKurs) != Double
				.doubleToLongBits(other.prodajniKurs))
			return false;
		if (Double.doubleToLongBits(srednjiKurs) != Double
				.doubleToLongBits(other.srednjiKurs))
			return false;
		if (valuta == null) {
			if (other.valuta != null)
				return false;
		} else if (!valuta.equals(other.valuta))
			return false;
		return true;
	}
	public String toString() {
		return "Kurs [valuta=" + valuta + ", srednjiKurs=" + srednjiKurs
				+ ", prodajniKurs=" + prodajniKurs + ", kupovniKurs="
				+ kupovniKurs + ", datum=" + datum + "]";
	}
	
	
}
