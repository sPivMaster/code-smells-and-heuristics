package examplePackage;

import static examplePackage.Days.Weekday.SATURDAY;
import static examplePackage.Days.Weekday.SUNDAY;

public class SwitchCase {

    public SwitchCase(Days.Weekday day) {
        switch (day) {
            case SATURDAY:
            case SUNDAY:
                System.out.println(day);
                break;
            default:
                break;
        }
    }
}