package com.akojimsg.msff;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyService {
    private static Logger logger = LoggerFactory.getLogger(MyService.class);

    private MyRepository repository;

    public MyService(MyRepository repository) {
        this.repository = repository;
    }

    public void doSomething(){
        logger.info("Make some bussiness logic happen");
        repository.doQuery();
    }
}
