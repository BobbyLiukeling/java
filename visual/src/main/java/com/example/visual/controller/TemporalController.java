package com.example.visual.controller;

import com.example.visual.model.NumberAtSomeTime;
import com.example.visual.model.NumberOfRegion;
import com.example.visual.model.PVNumberAtSomeTime;
import com.example.visual.service.RabiesTemporalService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController //表明这个控制类提供Restful接口
@EnableAutoConfiguration
public class TemporalController {

    //注入服务类
    @Resource
    private RabiesTemporalService rabiesTemporalService;

    @RequestMapping(value="/rabies/HRTimeYear", method=RequestMethod.GET, produces = "application/json")
    public   List<NumberAtSomeTime> getHRTimeYear(@RequestParam("region") String region,
                                                  @RequestParam("startYear") String startYear,
                                                  @RequestParam("endYear") String endYear,
                                                  @RequestParam("unit") String unit){
        System.out.println("后台接收到：region=" + region + ",startYear=" + startYear + ",endYear=" +endYear
                            +",unit=" +unit);
        List<NumberAtSomeTime> result =null;
        if(unit.equals("Year")){
            result = this.rabiesTemporalService.getRabiesTemporalByYear(region, startYear, endYear);
        }
        else if(unit.equals("Quarter")){
            result = this.rabiesTemporalService.getRabiesTemporalByQuarter(region, startYear, endYear);
        }
        else{
            result = this.rabiesTemporalService.getRabiesTemporalByMonth(region, startYear, endYear);
        }
        return result;
    }

    @RequestMapping(value="/rabies/PVTimeYear", method=RequestMethod.GET, produces = "application/json")
    public   List<PVNumberAtSomeTime> getPVTimeYear(@RequestParam("region") String region,
                                                    @RequestParam("startYear") String startYear,
                                                    @RequestParam("endYear") String endYear,
                                                    @RequestParam("unit") String unit){
        List<PVNumberAtSomeTime> result = null;
        if(unit.equals("Year")){
            result =  this.rabiesTemporalService.getVaccinationTemporalByYear(region, startYear, endYear);
        }
        else{
            result = this.rabiesTemporalService.getVaccinationTemporalByQuarter(region, startYear, endYear);
        }
        return result;
    }

}
