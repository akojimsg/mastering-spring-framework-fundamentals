package com.akojimsg.msff;

import java.util.logging.Logger;

public class MyRepository {
    private static Logger logger = Logger.getLogger(MyRepository.class.getName());
    public void doQuery() {
        logger.info("Bussiness logic happens here");
    }
}
