

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Test {

    public static void main(String[] args) {
        final Logger logger = LogManager.getLogger(Test.class.getName());
        logger.error("Test Logger Messege");

    }


}
