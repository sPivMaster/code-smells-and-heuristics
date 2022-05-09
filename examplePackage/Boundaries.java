package examplePackage;

public class Boundaries {

    private int einzelwert;
    private int zwischensumme;
    private Rechnung rechnung;
    
    public Boundaries() {
        einzelwert = 0;
        zwischensumme = 0;
        rechnungErstellen();
    }

    public void rechnungErstellen() {
        int naechsterEinzelwert = einzelwert + 1;
        if (naechsterEinzelwert < zwischensumme) {
            rechnung = new examplePackage.Rechnung(naechsterEinzelwert, zwischensumme);
        }
    }
}

    /*public void rechnungErstellen() {
        if (einzelwert + 1 < zwischensumme) {
            rechnung = new Rechnung(einzelwert + 1, zwischensumme);
        }
    }*/
