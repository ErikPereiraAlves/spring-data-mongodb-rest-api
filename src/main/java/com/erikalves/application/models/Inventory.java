package com.erikalves.application.models;

import org.springframework.data.annotation.Id;

import java.sql.Timestamp;

public class Inventory {

    @Id
    private String inventoryId;

    private String productId;

    private int productCount;

    private Timestamp createdTimestamp;

    private Timestamp updatedTimestamp;




}
