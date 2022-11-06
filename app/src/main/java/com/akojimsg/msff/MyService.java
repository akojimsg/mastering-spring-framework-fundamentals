package com.akojimsg.msff;

import java.util.logging.Logger;

public class MyService {
    private static Logger logger = Logger.getLogger(MyService.class.getName());

    private MyRepository repository;

    public void doBussinessLogic(){
        logger.info("Make some bussiness logic happen");
        repository.doQuery();
    }

    public void setRepository(MyRepository repository) {
        this.repository = repository;
    }
}
