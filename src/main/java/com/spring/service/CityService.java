package com.spring.service;

import com.spring.domian.City;
import org.apache.ibatis.annotations.Param;
public interface CityService {
    City findByName(String cityName);
}
