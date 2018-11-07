package ba.unsa.etf.rpr;

public class PlanStudija {
    String nazivStudija;
    int brojSemestara;
    Semestar[] semestri;
    public PlanStudija(String nazivStudija, int brojSemestara, Semestar[] semestri){}
    public String dajNazivStudija(){return nazivStudija;}
    public int dajBrojSemestara(){return brojSemestara;}

}
