package menjacnica;

public class Valuta {

	private String nazivValute;
	private String skraceniNaziv;
	public String getNazivValute() {
		return nazivValute;
	}
	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}
	public void setNazivValute(String nazivValute)throws Exception {
		if(nazivValute==null||nazivValute.isEmpty())throw new Exception();
		this.nazivValute = nazivValute;
	}
	public void setSkraceniNaziv(String skraceniNaziv)throws Exception {
		if(skraceniNaziv==null || skraceniNaziv.length()!=3)throw new Exception();
		this.skraceniNaziv = skraceniNaziv;
	}
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((nazivValute == null) ? 0 : nazivValute.hashCode());
		result = prime * result
				+ ((skraceniNaziv == null) ? 0 : skraceniNaziv.hashCode());
		return result;
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Valuta other = (Valuta) obj;
		if (nazivValute == null) {
			if (other.nazivValute != null)
				return false;
		} else if (!nazivValute.equals(other.nazivValute))
			return false;
		if (skraceniNaziv == null) {
			if (other.skraceniNaziv != null)
				return false;
		} else if (!skraceniNaziv.equals(other.skraceniNaziv))
			return false;
		return true;
	}
	public String toString() {
		return "Valuta [nazivValute=" + nazivValute + ", skraceniNaziv="
				+ skraceniNaziv + "]";
	}
	
	
	
}
