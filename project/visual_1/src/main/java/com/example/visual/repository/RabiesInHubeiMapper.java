package com.example.visual.repository;

import com.example.visual.model.RabiesInHubei;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RabiesInHubeiMapper {
    //对应xml映射文件元素的ID
    //mapper接口中的多个参数需要用@Param
    List<RabiesInHubei> selectByPrimaryKey(@Param("city") String city, @Param("year") String year);
}
