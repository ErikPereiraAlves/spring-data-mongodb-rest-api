package com.erikalves.application.models;

import org.springframework.data.annotation.Id;

import java.sql.Timestamp;

public class Product {

    @Id
    private String productId;

    private String productName;
    private String productTitle;
    private String productDescription;
    private String productImageUrl;
    private double productPrice;
    private Timestamp createdTimestamp;
    private Timestamp updatedTimestamp;

}
