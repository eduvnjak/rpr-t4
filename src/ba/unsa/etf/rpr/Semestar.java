package ba.unsa.etf.rpr;

public class Semestar{
    private Predmet[] predmetiObavezni;
    private Predmet[] predmetiIzborni;
    private int brojObaveznihPredmeta;
    private int brojIzbornihPredmeta;
    public Semestar(Predmet[] obavezni, Predmet[] izborni){
        predmetiObavezni = obavezni;
        predmetiIzborni = izborni;
    }
    int dajBrojObaveznihPredmeta(){return brojObaveznihPredmeta;}
    int dajBrojIzbornihPredmeta(){return brojIzbornihPredmeta;}
    public Predmet dajPredmetObavezni(int i){
        return predmetiObavezni[i];
    }
    public Predmet dajPredmetIzborni(int i){
        return predmetiIzborni[i];
    }
}
