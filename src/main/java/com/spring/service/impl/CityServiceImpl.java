package com.spring.service.impl;

import com.spring.dao.CityDao;
import com.spring.domian.City;
import com.spring.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;

    @Override
    public City findByName(String cityName) {
        City byName = cityDao.findByName(cityName);
        System.out.println(byName);
        return byName;
    }
}
