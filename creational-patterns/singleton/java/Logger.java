public class Logger {
    private static volatile Logger instance;
    public String log;

    private Logger(String log) {
        this.log = log;
    }

    public synchronized static Logger getInstance(String log) {
        if (instance == null) {
            instance = new Logger(log);
        }
        return instance;
    }

    public String info(String message){
        return "[INFO] : " + message;
    }
}
