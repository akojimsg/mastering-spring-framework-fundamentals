package com.akojimsg.msff;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {
    public void loadStaticData() {
        System.out.println("Loading static data ...");
    }
}
