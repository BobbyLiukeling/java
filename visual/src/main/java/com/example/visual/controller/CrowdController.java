package com.example.visual.controller;

import com.example.visual.model.NumberAtSomeTime;
import com.example.visual.model.NumberForPerson;
import com.example.visual.service.RabiesCrowdService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController //表明这个控制类提供Restful接口
@EnableAutoConfiguration
public class CrowdController {
//注入服务类
    @Resource
    private RabiesCrowdService rabiesCrowdService;
    @RequestMapping(value="/rabies/HRCrowdYear", method= RequestMethod.GET, produces = "application/json")
    public NumberForPerson getHRTimeYear(@RequestParam("startYear") String startYear,
                                                @RequestParam("endYear") String endYear){
//        System.out.println("后台接收到：startYear=" + startYear + ",endYear=" +endYear);
        NumberForPerson result = rabiesCrowdService.getPersonData(startYear, endYear);
//        System.out.println(result.getTeenager());
        return result;
    }
}
