package com.akojimsg.msff;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

public class MyService {
    private static Logger logger = Logger.getLogger(MyService.class.getName());
    private MyRepository repository;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    private String firstName;
    private String secondName;

    public void setRepository(MyRepository repository) {
        this.repository = repository;
    }

    public void doBussinessLogic(){
        logger.info("Make some bussiness logic happen for " + firstName + " " + secondName);
        repository.doQuery();
    }

}
