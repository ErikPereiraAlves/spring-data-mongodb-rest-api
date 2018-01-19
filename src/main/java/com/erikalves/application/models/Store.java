package com.erikalves.application.models;

import org.springframework.data.annotation.Id;

import java.sql.Timestamp;

public class Store {

    @Id
    private String storeId;

    private String storeTitle;

    private String storeDescription;

    private Timestamp createdTimestamp;
    private Timestamp updatedTimestamp;

    private String locationId;
}
