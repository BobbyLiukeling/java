package com.example.visual.controller;

import com.example.visual.model.RabiesInHubei;
import com.example.visual.service.RabiesInHubeiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController  //表明这个控制类提供Restful接口
@EnableAutoConfiguration
@RequestMapping("/test")
public class HelloController {

    //注入服务类
    @Resource
    private RabiesInHubeiService rabiesInHubeiService;

    @RequestMapping(value = "{year}", method = RequestMethod.GET, produces = "application/json")
    public RabiesInHubei getRabiesInHubeiForTest(@PathVariable String city, @PathVariable String year) throws Exception {

        List<RabiesInHubei> rabiesInHubei = this.rabiesInHubeiService.getRabiesInHubeiForTest(city, year);
        /*if(rabiesInHubei!=null){
            System.out.println("city="+rabiesInHubei.getCity()+"year="+rabiesInHubei.getYear()+
                    ":"+rabiesInHubei.getInfected()+","+rabiesInHubei.getExposed());
        }
        else
            System.out.println("没查到！");*/
        System.out.println("没查到！" + rabiesInHubei.size());
        return null;
    }
}
