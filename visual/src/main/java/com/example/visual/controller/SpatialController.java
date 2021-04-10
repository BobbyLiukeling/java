package com.example.visual.controller;


import com.example.visual.model.NumberOfRegion;
import com.example.visual.service.RabiesSpatialService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController //表明这个控制类提供Restful接口
@EnableAutoConfiguration
public class SpatialController {
    //注入服务类
    @Resource
    private RabiesSpatialService rabiesSpatialService;

    @RequestMapping(value="/rabies/HRSpatialByYear", method= RequestMethod.GET, produces = "application/json")
    public List<NumberOfRegion> getHRSpatialByYear(@RequestParam("areaName") String areaName,
                                              @RequestParam("startYear") String startYear,
                                              @RequestParam("endYear") String endYear){
        List<NumberOfRegion> result = rabiesSpatialService.getNumberOfRegionInAreaName(areaName, startYear,
                                        endYear, "infected");
        return result;
    }

    @RequestMapping(value="/rabies/HRSpatialByYearCity", method= RequestMethod.GET, produces = "application/json")
    public List<NumberOfRegion> getHRSpatialByYearCity(@RequestParam("areaName") String areaName,
                                                   @RequestParam("startYear") String startYear,
                                                   @RequestParam("endYear") String endYear){
        List<NumberOfRegion> result = rabiesSpatialService.getNumberOfRegionInAreaName(areaName, startYear,
                endYear, "infectedCity");
        return result;
    }

    @RequestMapping(value ="/rabies/PVSpatialByYear", method = RequestMethod.GET, produces = "application/json")
    public List<NumberOfRegion> getPVSpatialByYear(@RequestParam("areaName") String areaName,
                                                   @RequestParam("startYear") String startYear,
                                                   @RequestParam("endYear") String endYear,
                                                   @RequestParam("dataType") String dataType){
        List<NumberOfRegion> result = rabiesSpatialService.getNumberOfRegionInAreaName(areaName, startYear,
                                        endYear, dataType);
        return result;
    }
}
