package com.example.visual.service;

import com.example.visual.model.RabiesInHubei;

import java.util.List;

//RabiesInHubei服务接口类
public interface RabiesInHubeiService {
    //测试mybatis是否配置成功
    public List<RabiesInHubei> getRabiesInHubeiForTest(String city, String year);
}
