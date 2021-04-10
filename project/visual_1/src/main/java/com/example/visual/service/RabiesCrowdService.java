package com.example.visual.service;

import com.example.visual.model.NumberForPerson;

import java.util.List;

public interface RabiesCrowdService {
    //根据年份查询人群间分布数据
    public NumberForPerson getPersonData(String startYear, String endYear);
}
