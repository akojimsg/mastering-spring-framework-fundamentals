package com.akojimsg.msff.data;

import org.springframework.stereotype.Repository;

import java.util.logging.Logger;
@Repository
public class MyRepositoryImpl implements MyRepository {
    private static Logger logger = Logger.getLogger(MyRepositoryImpl.class.getName());

    @Override
    public void doQuery() {
        logger.info("Doing DB Query");
    }
}
