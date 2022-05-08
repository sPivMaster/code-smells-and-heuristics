public class Configuration {
    public static void main(String[] args) throws Exception {
        Arguments arguments = parseCommandLine(args);
        ...
    }
    
    public class Arguments {
        public static final String DEFAULT_PATH = ".";
        public static final String DEFAULT_ROOT = "FitNesseRoot";
        public static final int DEFAULT_PORT = 80;
        public static final int DEFAULT_VERSION_DAYS = 14;
        ...
    }
}