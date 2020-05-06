package com.athqyj.hqyj.Mapper.ym;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface LoginMapper {

    /*验证登录人员信息进行登录*/
    @Select("select COUNT(*) from sys_login where nvcUsername=#{nvcUsername} and nvcPsw=#{nvcPsw}")
    public int loginInfo(@Param("nvcUsername") String nvcUsername, @Param("nvcPsw") String nvcPsw);

}
