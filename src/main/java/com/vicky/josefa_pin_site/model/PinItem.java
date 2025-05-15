package com.vicky.josefa_pin_site.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.bson.types.ObjectId;

import java.util.Date;

@Document(collection="pins")
public class PinItem {
    @Id
    private String id;

    private String name;
    private Date dateCollected;
    private String category;

    public PinItem(String name, Date dateCollected, String category) {
//        this.id = id;
        this.name = name;
        this.dateCollected = dateCollected;
        this.category = category;
    }

    public String getName() {
        return this.name;
    }
}
