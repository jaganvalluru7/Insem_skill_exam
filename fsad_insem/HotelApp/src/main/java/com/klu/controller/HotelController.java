package com.klu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klu.model.Hotel;
import com.klu.service.HotelService;

@RestController
@RequestMapping("/hotel")
public class HotelController 
{
    @Autowired
    HotelService service;

    @PostMapping("/add")
    public Hotel addHotel(@RequestBody Hotel h)
    {
        return service.addHotel(h);
    }

    @PutMapping("/update")
    public Hotel updateHotel(@RequestBody Hotel h)
    {
        return service.updateHotel(h);
    }
}