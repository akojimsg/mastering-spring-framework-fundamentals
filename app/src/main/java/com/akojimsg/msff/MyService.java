package com.akojimsg.msff;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;
@Service
public class MyService {
    private static Logger logger = Logger.getLogger(MyService.class.getName());
    @Value("${my.name}")
    private String name;
    private MyRepository repository;
    @Autowired
    public MyService(MyRepository repository) {
        this.repository = repository;
    }
    public void doBussinessLogic(){
        logger.info("Make some bussiness logic happen for " + this.name);
        repository.doQuery();
    }

}
