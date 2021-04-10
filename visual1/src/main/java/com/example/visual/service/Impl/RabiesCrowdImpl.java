package com.example.visual.service.Impl;

import com.example.visual.model.NumberForPerson;
import com.example.visual.repository.RabiesCrowdMapper;
import com.example.visual.repository.RabiesSpatialMapper;
import com.example.visual.service.RabiesCrowdService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("rabiesCrowd")
public class RabiesCrowdImpl implements RabiesCrowdService {
    //注入mapper类
    @Resource
    private RabiesCrowdMapper rabiesCrowdMapper;
    @Override
    public NumberForPerson getPersonData(String startYear, String endYear) {
        return rabiesCrowdMapper.selectPersonData(startYear, endYear);
    }
}
