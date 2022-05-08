import timer.Timer;

public class Encapsulate {

    private Timer timer;

    public Encapsulate() {
        timer = new Timer();

        if (shouldBeDeleted(timer));
        if (timer.hasExpired() && !timer.isRecurrent());
    }
}