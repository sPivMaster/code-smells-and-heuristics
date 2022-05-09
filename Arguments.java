public class Arguments {
    public static final String DEFAULT_PATH = ".";
    public static final String DEFAULT_ROOT = "FitNesseRoot";
    public static final int DEFAULT_PORT = 80;
    public static final int DEFAULT_VERSION_DAYS = 14;

    public static String[] parseCommandLine(String[] args) {
        if (args[0].isEmpty()) {
            args[0] = DEFAULT_PATH;
        }
        
        if (args[1].isEmpty()) {
            args[1] = DEFAULT_ROOT;
        }
        
        return args;
    }
}