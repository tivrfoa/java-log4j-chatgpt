package org.acme;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public void doSomeWork() {
        logger.debug("Starting doSomeWork method");
        // Do some work here
        logger.info("Work completed successfully");
    }

    public static void main(String[] args) {
        Main myClass = new Main();
        myClass.doSomeWork();
    }
}