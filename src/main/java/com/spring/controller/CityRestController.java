package com.spring.controller;

import com.spring.domian.City;
import com.spring.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityRestController {
    @Autowired
    private CityService cityService;
//11
    @RequestMapping(value = "/find/{cityName}",method = RequestMethod.GET)
    public City findByCity(@PathVariable() String cityName){
        return cityService.findByName(cityName);
    }
}
