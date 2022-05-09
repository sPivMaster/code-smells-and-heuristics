import java.util.ArrayList;
import java.util.List;

public class Names {
    private int x;
    private double c;
    private List<String> n;

    private int positionAchseX;
    private double gehaltsauszahlung;

    public int i_counter;
    private double d_mehrwertsteuer;
    private List<String> namen;

    public Names() {
        alleNamenAuflisten();
        alleNamenAuflistenUndSortieren();
    }

    public void alleNamenAuflisten() {
        namen = new ArrayList<>();

        for (int i = 0; i < namen.size(); i++) {
            System.out.println(namen.get(i));
        }
    }

    public void alleNamenAuflistenUndSortieren() {
        // Your code here
    }
}