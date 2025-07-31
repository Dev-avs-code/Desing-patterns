
public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance("Log 1");
        Logger logger2 = Logger.getInstance("Log 2");

        System.out.println("Logger: " + logger1.log + " ---> " + logger1.info("Message 1"));
        System.out.println("Logger: " + logger2.log + " ---> " + logger2.info("Message 2"));
    }
}
