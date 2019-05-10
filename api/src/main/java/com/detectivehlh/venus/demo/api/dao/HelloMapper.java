package com.detectivehlh.venus.demo.api.dao;

import com.detectivehlh.venus.demo.api.entity.Hello;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * HelloMapper
 *
 * @author Lunhao Hu
 * @date 2019-05-10 14:34
 **/
@Mapper
@Repository
public interface HelloMapper {
    List<Hello> select();
}
