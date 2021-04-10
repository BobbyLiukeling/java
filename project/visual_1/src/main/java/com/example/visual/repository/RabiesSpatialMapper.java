package com.example.visual.repository;

import com.example.visual.model.NumberOfRegion;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RabiesSpatialMapper {

    //方法名对应xml映射文件元素的ID
    //mapper接口中的多个参数可以使用@Param
    //查找地区某年-某年感染数
    public List<NumberOfRegion> selectInfectedOfRegion(@Param("areaName") String areaName,
                                                       @Param("startYear") String startYear,
                                                       @Param("endYear") String endYear);

    //查找地区某年-某年暴露数
    public List<NumberOfRegion> selectExposedOfRegion(@Param("areaName") String areaName,
                                                      @Param("startYear") String startYear,
                                                      @Param("endYear") String endYear);

    //查找地区某年-某年疫苗数
    public List<NumberOfRegion> selectVaccinationOfRegion(@Param("areaName") String areaName,
                                                          @Param("startYear") String startYear,
                                                          @Param("endYear") String endYear);
}
