package com.akojimsg.msff.data;

import org.springframework.stereotype.Repository;

import java.util.logging.Logger;

@Repository
public class SomeOtherRepositoryImpl implements MyRepository {
    private static Logger logger = Logger.getLogger(SomeOtherRepositoryImpl.class.getName());

    @Override
    public void doQuery() {
        logger.info("Doing some other DB Query, shit!");
    }
}
