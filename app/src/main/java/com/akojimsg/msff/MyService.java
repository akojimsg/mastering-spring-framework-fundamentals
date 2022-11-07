package com.akojimsg.msff;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
@Service
public class MyService implements EnvironmentAware {
    private static Logger logger = Logger.getLogger(MyService.class.getName());
    @Value("${service.baseUrl}")
    private String SERVICE_BASEURL;
    private MyRepository repository;
    private Environment environment;
    @Autowired
    public MyService(MyRepository repository) {
        this.repository = repository;
    }
    public void doBussinessLogic(){
        logger.info("Make some bussiness logic happen");
        logger.log(Level.INFO, "Active profiles: {0}", Arrays.toString(environment.getActiveProfiles()));
        logger.log(Level.INFO, "Connecting to [{0}]", SERVICE_BASEURL);
        repository.doQuery();
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
