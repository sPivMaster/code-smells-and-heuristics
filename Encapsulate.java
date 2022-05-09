public class Encapsulate {

    private Timer timer;

    public Encapsulate() {
        timer = new Timer();

        if (timer.hasExpired() && !timer.isRecurrent()) {
            // Your code here
        };
        
    }
}

/*
if (shouldBeDeleted(timer)) {
            // Your code here
        };
        
        public boolean shouldBeDeleted(Timer timer) {
        return timer.hasExpired() && !timer.isRecurrent();
    }*/