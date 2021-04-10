package com.example.visual.service.Impl;

import com.example.visual.model.RabiesInHubei;
import com.example.visual.service.RabiesInHubeiService;
import com.example.visual.repository.RabiesInHubeiMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

@Service("rabiesInHubei")
public class RabiesInHubeiImpl implements RabiesInHubeiService {
    //注入mapper类
    @Resource
    private RabiesInHubeiMapper rabiesInHubeiMapper;

    @Override
    public List<RabiesInHubei> getRabiesInHubeiForTest(String city, String year) {
        return rabiesInHubeiMapper.selectByPrimaryKey(city, year);
    }
}
