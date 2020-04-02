package com.example.qyy.mapper;

import com.example.qyy.dao.QueryDAO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface QueryMapper {

    @Select("select id,timeout,resultType,content,gmtCreate,gmtUpdate from query where id = #{id}")
    QueryDAO selectById(Integer id);

    @Insert("insert into query (timeout,resultType,content) value (#{timeout},#{resultType},#{content})")
    Integer insert(QueryDAO queryDAO);

    @Select("select id,timeout,resultType,content,gmtCreate,gmtUpdate from query order by id desc limit #{param1}, #{param2}")
    List<QueryDAO> pageGetList(Integer start, Integer end);
}
