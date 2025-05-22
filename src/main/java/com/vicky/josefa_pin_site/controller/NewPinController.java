package com.vicky.josefa_pin_site.controller;

import com.vicky.josefa_pin_site.PinService;
import com.vicky.josefa_pin_site.model.PinItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class NewPinController {

    @Autowired
    private PinService pinService;
    @PostMapping("/newPin")
    public PinItem newPin(@RequestParam(value = "name") String name, @RequestParam(value = "category") String category) {
        return pinService.createPin(new PinItem(name, new Date(), category));
    }

    @GetMapping("/getPins")
    public List<PinItem> getPins() {
        return pinService.getAllPins();
    }
}
