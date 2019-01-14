package com.log;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class log4j_config {

    private static Logger logger = LogManager.getLogger(log4j_config.class);


    public static void main(String[] args) {

        logger.info("hi"+12);
    }
}
