package com.example.visual.repository;

import com.example.visual.model.NumberAtSomeTime;
import com.example.visual.model.NumberOfRegion;
import com.example.visual.model.PVNumberAtSomeTime;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface RabiesTemporalMapper {
    //方法名对应xml映射文件元素的ID
    //mapper接口中的多个参数可以使用@Param
    List<NumberAtSomeTime> selectRabiesByYear(@Param("region") String region, @Param("startYear") String startYear,
                                              @Param("endYear") String endYear);

    List<NumberAtSomeTime> selectRabiesByQuarter(@Param("region") String region, @Param("startYear") String startYear,
                                                 @Param("endYear") String endYear);

    List<NumberAtSomeTime> selectRabiesByMonth(@Param("region") String region, @Param("startYear") String startYear,
                                               @Param("endYear") String endYear);

    List<PVNumberAtSomeTime> selectVaccinationByYear(@Param("region") String region, @Param("startYear") String startYear,
                                                     @Param("endYear") String endYear);

    List<PVNumberAtSomeTime> selectVaccinationByQuarter(@Param("region") String region, @Param("startYear") String startYear,
                                                        @Param("endYear") String endYear);

}
