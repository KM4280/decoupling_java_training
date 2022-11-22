import java.lang.System.Logger;

void log(String message);

public class ConsoleLogger implements Logger {
    System.out.print(message);
}
public class LoggerFactory {
    public static Logger getLogger (String name) {
          return Logger;     
    } 
}