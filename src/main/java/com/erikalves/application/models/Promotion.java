package com.erikalves.application.models;

import org.springframework.data.annotation.Id;

import java.sql.Timestamp;

public class Promotion {

    @Id
    private String promotionId;

    private Timestamp createdTimestamp;
    private Timestamp updatedTimestamp;

    private Timestamp promotionStart;

    private Timestamp promotionEnd;

    private int promotionActive;


}
