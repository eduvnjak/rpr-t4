package ba.unsa.etf.rpr;

public class Predmet {
    private String nazivPredmeta;
    private int brojECTSPoena;
    private Student[] studentiNaPredmetu;
    public  Predmet(String nazivPredmeta, int brojECTSPoena){}
    public void DodajStudenta(Student s){};
    public String dajNazivPredmeta(){ return nazivPredmeta;}
    public int dajBrojECTSPoena(){return  brojECTSPoena;}
    public void ispisiStudenteNaPredmetu(){}
}
