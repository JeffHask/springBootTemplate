package com.haskovec.service;

import com.haskovec.data.TestData;
import com.haskovec.repo.TestDataRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private TestDataRepo testDataRepo;

    public TestData getTestDataById(int id) {
        return testDataRepo.findOne(id);
    }
}
