package com.ccchen.dao;

import com.ccchen.pojo.user;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface userDao {

    @Select("select * from tb_user where userId = #{id}")
    public user getById(Integer id);

    @Select("select * from tb_user where username = #{username} and password = #{password}")
    user getByusernameAndPassword(user uu);

    @Insert("insert into user.tb_user (username, password) " +
            "VALUES(#{username},#{password})")
    void insert(user uu);


}
