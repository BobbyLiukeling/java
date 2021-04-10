package com.example.visual.service.Impl;

import com.example.visual.model.NumberOfRegion;
import com.example.visual.repository.RabiesSpatialMapper;
import com.example.visual.service.RabiesSpatialService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("rabiesSpatial")
public class RabiesSpatialImpl implements RabiesSpatialService {
    //注入mapper类
    @Resource
    private RabiesSpatialMapper rabiesSpatialMapper;

    @Override
    public List<NumberOfRegion> getNumberOfRegionInAreaName(String areaName, String startYear, String endYear,
                                                            String dataType){
//        System.out.println("查找" + areaName + " " + startYear + " " + endYear + " " + dataType);
        switch (dataType){
            case "infected":
                return rabiesSpatialMapper.selectInfectedOfRegion(areaName, startYear, endYear);
            case "exposed":
                return rabiesSpatialMapper.selectExposedOfRegion(areaName, startYear, endYear);
            case "vaccination":
                return rabiesSpatialMapper.selectVaccinationOfRegion(areaName, startYear, endYear);
            case "infectedCity":
                return rabiesSpatialMapper.selectInfectedOfRegionCity(areaName, startYear, endYear);
            default:
                return null;
        }
    }

}
