package com.example.visual.service;

import com.example.visual.model.NumberOfRegion;

import java.util.List;

//人类狂犬病空间分布服务接口
public interface RabiesSpatialService {
    //查询某地区内各区域某年-某年时间段内人类狂犬病发病数量
    public List<NumberOfRegion> getNumberOfRegionInAreaName(String areaName, String startYear, String endYear,
                                                            String dataType);

}
