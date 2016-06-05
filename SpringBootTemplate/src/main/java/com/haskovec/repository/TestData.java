package com.haskovec.repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Jeff on 6/5/2016.
 */
@Entity
@Table(name = "test_data")
public class TestData {

    @Column(name = "id")
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
