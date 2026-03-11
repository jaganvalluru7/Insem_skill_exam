package com.klu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.klu.model.Hotel;
import com.klu.repository.HotelRepository;

@Service
public class HotelService 
{
    @Autowired
    HotelRepository repo;

    public Hotel addHotel(Hotel h)
    {
        return repo.save(h);
    }

    public Hotel updateHotel(Hotel h)
    {
        return repo.save(h);
    }
}