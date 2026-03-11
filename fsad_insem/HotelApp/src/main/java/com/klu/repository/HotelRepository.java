package com.klu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.klu.model.Hotel;

public interface HotelRepository extends JpaRepository<Hotel,Integer>
{

}