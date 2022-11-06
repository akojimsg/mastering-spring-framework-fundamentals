package com.akojimsg.msff.business;

import com.akojimsg.msff.data.MyRepository;
import com.akojimsg.msff.data.SomeOtherRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class AnotherServiceImpl implements MyService {
    private static Logger logger = Logger.getLogger(AnotherServiceImpl.class.getName());
    private MyRepository repository;
    @Autowired
    public AnotherServiceImpl(SomeOtherRepositoryImpl repository) {
        this.repository = repository;
    }
    @Override
    public void doBussinessLogic(){
        logger.info("Make some bussiness logic happen in another way");
        repository.doQuery();
    }
}
