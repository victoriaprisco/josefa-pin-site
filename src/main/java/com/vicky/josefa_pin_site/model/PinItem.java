package com.vicky.josefa_pin_site.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection="pins")
public class PinItem {
    @Id
    private String id;

    private final String name;
    private final Date dateCollected;
    private final String category;

    public PinItem(String name, Date dateCollected, String category) {
        this.name = name;
        this.dateCollected = dateCollected;
        this.category = category;
    }

    public String getName() {
        return this.name;
    }

    public String getCategory() {
        return this.category;
    }
}
