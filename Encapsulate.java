public class Encapsulate {

    private Timer timer;

    public Encapsulate() {
        timer = new Timer();

        if (shouldBeDeleted(timer)) {
            // Your code here
        };

        if (timer.hasExpired() && !timer.isRecurrent()) {
            // Your code here
        };
    }

    public boolean shouldBeDeleted(Timer timer) {
        // Your code here
        return true;
    }
}