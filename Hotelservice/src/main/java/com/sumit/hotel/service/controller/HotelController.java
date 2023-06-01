package com.sumit.hotel.service.controller;

import com.sumit.hotel.service.Services.HotelService;
import com.sumit.hotel.service.entities.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @PostMapping("/create")
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
        return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.create(hotel));
    }


    @GetMapping("/{hotelId}")
    public ResponseEntity<Hotel> getById(@RequestBody String hotelId){
        return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.get(hotelId));
    }


    @GetMapping("/getall")
    public ResponseEntity<List<Hotel>> getAll(){
        return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.getAll());
    }



}
