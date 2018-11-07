package ba.unsa.etf.rpr;

public class PlanStudija {
    String nazivStudija;
    int brojSemestara;
    Semestar[] semestri;
    public PlanStudija(String nazivStudija, int brojSemestara, Semestar[] semestri){
        this.nazivStudija = nazivStudija;
        this.brojSemestara = brojSemestara;
        this.semestri = semestri;
    }
    public String dajNazivStudija(){return nazivStudija;}
    public int dajBrojSemestara(){return brojSemestara;}
    public Semestar dajSemestar(int i){
        if(i < 1 || i > brojSemestara) throw new IllegalArgumentException("Ne postoji taj semestar");
        return semestri[i];
    }
}
