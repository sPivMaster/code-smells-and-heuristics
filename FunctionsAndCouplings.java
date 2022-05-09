import java.util.ArrayList;
import java.util.List;

public class FunctionsAndCouplings {

    private List<Mitarbeiter> mitarbeiter;
    public FunctionsAndCouplings(List<Mitarbeiter> mitarbeiter) {
        this.mitarbeiter = mitarbeiter;
    }

    /*public void bezahlen() {
        for (Mitarbeiter m : mitarbeiter) {
            if (m.lohnzahlung()) {
                LohnTransfer lt = m.betragBerechnen();
                m.betragUeberweisen(lt);
            }
        }
    }*/

    public void bezahlen() {
        for (Mitarbeiter m : mitarbeiter) 
            betragBerechnen(m);
    }

    public void betragBerechnen(Mitarbeiter m) {
        if (m.lohnzahlung()) {
            betragBerechnenUndAuszahlen(m);
        }
    }

    public void betragBerechnenUndAuszahlen(Mitarbeiter m) {
        LohnTransfer lt = m.betragBerechnen();
        m.betragUeberweisen(lt);
    }
}