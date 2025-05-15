package com.vicky.josefa_pin_site;

import com.vicky.josefa_pin_site.model.PinItem;
import com.vicky.josefa_pin_site.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PinService {
    @Autowired
    private ItemRepository pinRepo;

    public List<PinItem> getAllPins() {
        return pinRepo.findAll();
    }

    public PinItem createPin(PinItem pin) {
        return pinRepo.save(pin);
    }
}
