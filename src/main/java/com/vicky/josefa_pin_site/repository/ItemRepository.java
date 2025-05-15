package com.vicky.josefa_pin_site.repository;

import com.vicky.josefa_pin_site.model.PinItem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface ItemRepository extends MongoRepository<PinItem, String> {
//    @Query("{'name':'?0'}")
//    PinItem findItemByName(String name);
//
//    @Query(value="{'category': '?0'}", fields="{'name' : 1}")
//    List<PinItem> findAll(String category);
//
//    public long count();
}
