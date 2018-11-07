package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Student {
    private String ime, prezime;
    private int brojIndeksa;
    private final PlanStudija upisaniPlan;
    private int trenutniSemestar;
    private Predmet[] odabraniIzborni;
    public Student(String ime, String prezime, int brojIndeksa, PlanStudija upisaniPlan){
        this.ime = ime;
        this.prezime = prezime;
        this.brojIndeksa = brojIndeksa;
        this.upisaniPlan = upisaniPlan;
        trenutniSemestar = 0;
    }
    public void upisiSemestar(){
        int ECTSopterecenje = 0;
        trenutniSemestar++;
        Semestar trenutni = dajUpisaniPlan().dajSemestar(trenutniSemestar);
        for(int i = 0; i < trenutni.dajBrojObaveznihPredmeta(); i++){
            trenutni.dajPredmetObavezni(i).dodajStudenta(this);
            ECTSopterecenje = trenutni.dajPredmetObavezni(i).dajBrojECTSPoena();
        }
        System.out.println("Odaberi izborne predmete: ");
        for(int i = 0; i < trenutni.dajBrojIzbornihPredmeta();i++){
            System.out.println((i+1)+". "+(trenutni.dajPredmetIzborni(i).ispis()));
        }
        while(ECTSopterecenje < 30){
            Scanner ulaz = new Scanner(System.in);
            int brojPredmeta = ulaz.nextInt();
            brojPredmeta--;
            trenutni.dajPredmetIzborni(brojPredmeta).dodajStudenta(this);
            ECTSopterecenje += trenutni.dajPredmetIzborni(brojPredmeta).dajBrojECTSPoena();
            for(int i = 0; i < 5; i++){
                if(odabraniIzborni[i] == null){
                    odabraniIzborni[i] = trenutni.dajPredmetIzborni(brojPredmeta);
                    break;
                }
            }
        }

    }
    public String dajIme(){return ime;}
    public String dajPrezime(){return prezime;}
    public int dajBrojIndeksa(){return brojIndeksa;}
    public PlanStudija dajUpisaniPlan(){return upisaniPlan;}
}
