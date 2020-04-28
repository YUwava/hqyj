package com.athqyj.hqyj.Mapper.ym;

import com.athqyj.hqyj.entity.LUptoprovince;
import com.athqyj.hqyj.entity.LisTongdao;
import com.athqyj.hqyj.entity.MInfo;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

@Mapper
public interface InfomationMapper{
    /*分页查询*/
    @Select("select * from m_info limit #{index},#{pageSize}")
    public List<MInfo> showInfoPage(@Param("index") Integer index, @Param("pageSize") Integer pageSize);



    /*查询总条数*/
    @Select("select count(*) from m_info")
    public int allcount();
    /*a*/
    /*联表查询人员信息*/
    @Results({@Result(id=true,column = "AutoID",property = "autoId"),
            @Result(column = "UpFlag", property = "upFlag"),
            @Result(column = "AutoID",property ="lUptoprovince", many = @Many(select = "com.athqyj.hqyj.Mapper.ym.InfomationMapper.getInfo",fetchType= FetchType.EAGER))})
    @Select("SELECT * from m_info where ID like '%${id}%' and fname like '%${fname}%' and mname like '%${mname}%' and midCard like  '%${midCard}%' and fidCard like  '%${fidCard}%' limit #{index},#{pageSize}")
    public List<MInfo> showAllInfoNice(@Param("fname")String fname,@Param("mname")String mname,@Param("midCard")String midCard,@Param("fidCard")String fidCard,@Param("id")String id,@Param("index") Integer index, @Param("pageSize") Integer pageSize);

    @Results({@Result(id=true,column="AutoID",property="autoId"),
            @Result(column = "UpFlag", property = "upFlag")})
    @Select("select * from l_uptoprovince where AutoID=#{AutoID}")
    public List<LUptoprovince> getInfo(@Param("AutoID") Integer autoId);

    /*状态信息表*/
    @Select("select * from l_uptoprovince")
    public List<LUptoprovince> geiUpInfo();











}
