public class Boundaries {
    if (einzelwert + 1 < zwischensumme) {
        rechnung = new Rechnung(einzelwert + 1, zwischensumme);
    }

    int naechsterEinzelwert = einzelwert + 1;
    if (naechsterEinzelwert < zwischensumme) {
        rechnung = new Rechnung(naechsterEinzelwert, zwischensumme);
    }
}