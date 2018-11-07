package ba.unsa.etf.rpr;

public class Predmet {
    private static final int KAPACITET = 100;
    private String nazivPredmeta;
    private int brojECTSPoena;
    private Student[] studentiNaPredmetu;
    public  Predmet(String nazivPredmeta, int brojECTSPoena){
        studentiNaPredmetu = new Student[KAPACITET];
        this.nazivPredmeta = nazivPredmeta;
        this.brojECTSPoena = brojECTSPoena;
    }
    public void dodajStudenta(Student s){
        for(int i = 0; i < 100; i++){
            if(studentiNaPredmetu[i] == null){
                studentiNaPredmetu[i] = s;
                break;
            }
        }
        System.out.println("Nema prostora na predmetu.");
    }
    public String dajNazivPredmeta(){ return nazivPredmeta;}
    public int dajBrojECTSPoena(){return  brojECTSPoena;}
    public void ispisiStudenteNaPredmetu(){
        int brojac = 1;
        for(int i = 0; i < 100; i++){
            if(studentiNaPredmetu[i] != null){
                System.out.println(brojac+". "+studentiNaPredmetu[i].dajIme()+" "+studentiNaPredmetu[i].dajPrezime()+" "+studentiNaPredmetu[i].dajBrojIndeksa());
                brojac++;
            }
        }
    }
    public String ispis(){
        return nazivPredmeta+ " " +brojECTSPoena;
    }
}
