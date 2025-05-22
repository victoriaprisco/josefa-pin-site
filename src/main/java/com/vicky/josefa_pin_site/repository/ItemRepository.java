package com.vicky.josefa_pin_site.repository;

import com.vicky.josefa_pin_site.model.PinItem;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ItemRepository extends MongoRepository<PinItem, String> {

}
