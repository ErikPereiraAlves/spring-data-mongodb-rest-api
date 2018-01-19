package com.erikalves.application.models;

import org.springframework.data.annotation.Id;

import java.sql.Timestamp;

public class Category {

    @Id
    private String categoryId;

    private String categoryTitle;

    private String categoryDescription;

    private Timestamp createdTimestamp;
    private Timestamp updatedTimestamp;
}
