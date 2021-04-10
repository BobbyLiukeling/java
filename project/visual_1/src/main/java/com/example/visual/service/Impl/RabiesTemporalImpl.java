package com.example.visual.service.Impl;

import com.example.visual.model.NumberAtSomeTime;
import com.example.visual.model.NumberOfRegion;
import com.example.visual.model.PVNumberAtSomeTime;
import com.example.visual.repository.RabiesTemporalMapper;
import com.example.visual.service.RabiesTemporalService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("rabiesTemporal")
public class RabiesTemporalImpl implements RabiesTemporalService {
    //注入mapper类
    @Resource
    private RabiesTemporalMapper rabiesTemporalMapper;

    @Override
    //查询各地区某年-某年时间段内人类狂犬病发病数量
    public List<NumberAtSomeTime> getRabiesTemporalByYear(String region, String startYear, String endYear) {
        return rabiesTemporalMapper.selectRabiesByYear(region, startYear, endYear);
    }

    //查询各地区某年某季度-某年某季度时间段内人类狂犬病发病数量
    @Override
    public List<NumberAtSomeTime> getRabiesTemporalByQuarter(String region, String startYear, String endYear) {
        return rabiesTemporalMapper.selectRabiesByQuarter(region, startYear, endYear);
    }

    //查询各地区某年某月-某年某月时间段内人类狂犬病发病数量
    @Override
    public List<NumberAtSomeTime> getRabiesTemporalByMonth(String region, String startYear, String endYear) {
        return rabiesTemporalMapper.selectRabiesByMonth(region, startYear, endYear);
    }

    //查询各地区某年-某年时间段内狂犬暴露+疫苗接种数量
    @Override
    public List<PVNumberAtSomeTime> getVaccinationTemporalByYear(String region, String startYear, String endYear) {
        return rabiesTemporalMapper.selectVaccinationByYear(region, startYear, endYear);
    }

    //查询各地区某年某季度-某年某季度时间段内狂犬暴露+疫苗接种数量
    @Override
    public List<PVNumberAtSomeTime> getVaccinationTemporalByQuarter(String region, String startYear,
                                                                    String endYear) {
        return rabiesTemporalMapper.selectVaccinationByQuarter(region, startYear, endYear);
    }

}
