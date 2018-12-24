package com.fml.springboot.mapper;

import com.fml.springboot.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    /**
     * 根据id查询用户
     */
    @Select("SELECT * FROM T_USER WHERE ID = #{id}")
    User findById(@Param("id") int id);

    /**
     * 新增用户
     */
    @Insert("INSERT INTO T_USER(NAME, AGE, ADDRESS, PHONE) VALUES(#{name}, #{age}, #{address}, #{phone})")
    int insert(@Param("name") String name, @Param("age") Integer age, @Param("address") String address, @Param("phone") String phone);

}
