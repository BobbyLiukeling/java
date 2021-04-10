package com.example.visual.repository;

import com.example.visual.model.NumberForPerson;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RabiesCrowdMapper {
    //方法名对应xml映射文件元素的ID
    //mapper接口中的多个参数可以使用@Param
    public NumberForPerson selectPersonData(@Param("startYear") String startYear,
                                           @Param("endYear") String endYear);
}
