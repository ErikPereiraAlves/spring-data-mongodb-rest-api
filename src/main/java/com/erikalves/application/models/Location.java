package com.erikalves.application.models;

import org.springframework.data.annotation.Id;

import java.sql.Timestamp;

public class Location {


    @Id
    private String locationId;
    private String country;
    private String state;
    private String city;
    private String street;
    private int zipcode;
    private int number;

    private Timestamp createdTimestamp;
    private Timestamp updatedTimestamp;
}
