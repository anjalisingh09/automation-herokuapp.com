package framework;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerClass extends Driver {
    static Logger logger;

    public Logger setInstanceOfLogger() {
        logger = Logger.getLogger(this.getClass().getName());
        return logger;
    }

    public static void logging(Level level, String message) {
        logger.log(level,message);
    }
}
