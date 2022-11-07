package com.akojimsg.msff;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;
@Service
public class MyService {
    private static Logger logger = Logger.getLogger(MyService.class.getName());
    @Autowired
    private MyRepository repository;
    @Value("${first.name}")
    private String firstName;
    @Value("${second.name:Adah}")
    private String secondName;
    public void doBussinessLogic(){
        logger.info("Make some bussiness logic happen for " + firstName + " " + secondName);
        repository.doQuery();
    }

    public void MyService(MyRepository repository) {
        this.repository = repository;
    }
}
