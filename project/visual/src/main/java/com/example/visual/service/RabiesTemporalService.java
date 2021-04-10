package com.example.visual.service;

import com.example.visual.model.NumberAtSomeTime;
import com.example.visual.model.NumberOfRegion;
import com.example.visual.model.PVNumberAtSomeTime;

import java.util.List;
import java.util.Map;

//人类狂犬病时间分布服务接口
public interface RabiesTemporalService {

    //查询各地区某年-某年时间段内人类狂犬病发病数量
    public List<NumberAtSomeTime> getRabiesTemporalByYear(String region, String startYear, String endYear);
    //查询各地区某年-某年分季度时间段内人类狂犬病发病数量
    public List<NumberAtSomeTime> getRabiesTemporalByQuarter(String region, String startYear, String endYear);
    //查询各地区某年-某年分月度时间段内人类狂犬病发病数量
    public List<NumberAtSomeTime> getRabiesTemporalByMonth(String region, String startYear, String endYear);
    //查询各地区某年-某年时间段内狂犬暴露+疫苗接种数量
    public List<PVNumberAtSomeTime> getVaccinationTemporalByYear(String region, String startYear, String endYear);
    //查询各地区某年-某年分季度时间段内狂犬暴露+疫苗接种数量
    public List<PVNumberAtSomeTime> getVaccinationTemporalByQuarter(String region, String startYear, String endYear);



}
