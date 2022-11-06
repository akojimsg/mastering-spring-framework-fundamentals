package com.akojimsg.msff.business;

import com.akojimsg.msff.data.MyRepository;
import com.akojimsg.msff.data.MyRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class MyServiceImpl implements MyService {
    private static Logger logger = Logger.getLogger(MyServiceImpl.class.getName());
    private MyRepository repository;
    @Autowired
    public MyServiceImpl(@Qualifier("myRepositoryImpl") MyRepository repository) {
        this.repository = repository;
    }
    @Override
    public void doBussinessLogic(){
        logger.info("Make some bussiness logic happen");
        repository.doQuery();
    }
}
