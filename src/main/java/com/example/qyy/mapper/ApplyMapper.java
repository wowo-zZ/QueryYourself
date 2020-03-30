package com.example.qyy.mapper;

import com.example.qyy.dao.ApplyDAO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ApplyMapper {

    @Insert("insert into apply(id,applyType,applyId,applyStatus) value (#{id},#{applyType},#{applyId},#{applyStatus})")
    int insert(ApplyDAO applyDAO);

    @Select("select id,applyType,applyId,applyStatus from apply where id = #{id}")
    ApplyDAO selectById(Integer id);
}
