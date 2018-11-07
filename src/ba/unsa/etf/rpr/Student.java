package ba.unsa.etf.rpr;

public class Student {
    private String ime, prezime;
    private int brojIndeksa;
    private final PlanStudija upisaniPlan;
    private Semestar upisaniSemestar;
    private Predmet[] upisaniPredmeti;
    public Student(String ime, String prezime, int brojIndeksa, PlanStudija upisaniPlan){
        this.upisaniPlan = upisaniPlan;
    }
    public void upisiSemestar(){
    }
    public String dajIme(){return ime;}
    public String dajPrezime(){return prezime;}
    public int dajBrojIndeksa(){return brojIndeksa;}
    public PlanStudija dajUpisaniPlan(){return upisaniPlan;}
}
