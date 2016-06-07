package com.haskovec.repo;

import com.haskovec.data.TestData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestDataRepo extends JpaRepository<TestData, Integer> {
}
