package com.akojimsg.msff;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyRepository {
    private static Logger logger = LoggerFactory.getLogger(MyService.class);
    public void doQuery() {
        logger.info("Bussiness logic happens here");
    }
}
