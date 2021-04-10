package com.example.demo.repository;
import com.example.demo.model.User;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserMapper {

    // 对应xml映射文件元素的ID
    User selectByPrimaryKey(long id);

}



