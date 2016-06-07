package com.haskovec.data;

import javax.persistence.*;

@Entity
@Table(name = "test_data")
public class TestData {

    @Column(name = "id")
    @Id
    @GeneratedValue
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
