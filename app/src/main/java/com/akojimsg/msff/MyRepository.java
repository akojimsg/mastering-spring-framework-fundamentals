package com.akojimsg.msff;

import org.springframework.stereotype.Repository;

import java.util.logging.Logger;
@Repository
public class MyRepository {
    private static Logger logger = Logger.getLogger(MyRepository.class.getName());

    public void doQuery() {
        logger.info("Bussiness logic happens here");
    }
}
