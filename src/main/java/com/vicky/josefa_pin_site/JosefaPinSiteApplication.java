package com.vicky.josefa_pin_site;

import com.vicky.josefa_pin_site.model.PinItem;
import com.vicky.josefa_pin_site.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.LinkedList;
import java.util.List;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, SecurityAutoConfiguration.class })
@EnableMongoRepositories
public class JosefaPinSiteApplication {

	@Autowired
	static ItemRepository pinItemRepo;

	List<PinItem> pinList = new LinkedList<PinItem>();


	public static void main(String[] args) {
		SpringApplication.run(JosefaPinSiteApplication.class, args);
	}

}
