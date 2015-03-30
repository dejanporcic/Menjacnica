package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.interfejsi.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {

	private LinkedList<Kurs> kursnaLista = new LinkedList<Kurs>();
	public void dodajKurs (Kurs kurs) {
		if (kurs == null)
			throw new RuntimeException("Kurs ne sme imati null vrednost");

		if (kursnaLista.contains(kurs))
			throw new RuntimeException("Kurs za danasnji dan je vec unet");
		
		kursnaLista.add(kurs);
	}
	
	public void obrisiKurs (Kurs kurs){
		if (kurs == null)
			throw new RuntimeException("Kurs ne sme imati null vrednost");
		
		if (!kursnaLista.contains(kurs))
			throw new RuntimeException("Kurs ne postoji");
		
		kursnaLista.remove(kurs);
		
	}
	public Kurs vratiKurs (String skraceniNaziv, GregorianCalendar datum) {
		if(skraceniNaziv==null && datum==null )
			return null;
		GregorianCalendar danas = new GregorianCalendar();
		Kurs trazeniKurs = new Kurs();
		if (!datum.after(danas))
			for (int i=0; i<kursnaLista.size();i++){
				if(kursnaLista.get(i).getValuta().getSkraceniNaziv().equals(skraceniNaziv)){
					try {
						trazeniKurs.setDatum(kursnaLista.get(i).getDatum());
						trazeniKurs.setKupovniKurs(kursnaLista.get(i).getKupovniKurs());
						trazeniKurs.setSrednjiKurs(kursnaLista.get(i).getSrednjiKurs());
						trazeniKurs.setValuta(kursnaLista.get(i).getValuta());
					} catch (Exception e) {
						e.printStackTrace();
					}
				}}
				
						
		return trazeniKurs;
	}
}
