package com.athqyj.hqyj.Mapper.ym;

import com.athqyj.hqyj.entity.LUptoprovince;
import com.athqyj.hqyj.entity.LisTongdao;
import com.athqyj.hqyj.entity.MInfo;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

@Mapper
public interface InfomationMapper/* extends tk.mybatis.mapper.common.Mapper<MInfo>*/{
    /*分页查询*/
    @Select("select * from m_info limit #{index},#{pageSize}")
    public List<MInfo> showInfoPage(@Param("index") Integer index, @Param("pageSize") Integer pageSize);

    @Select("select * from limit")
    public List<MInfo> selectAll();

    /*查询总条数*/
    @Select("select count(*) from m_info")
    public int allcount();


    @Results({@Result(id=true,column = "AutoID",property = "autoId"),
            @Result(column = "UpFlag", property = "upFlag"),
            @Result(column = "AutoID",property ="lUptoprovince", many = @Many(select = "com.athqyj.hqyj.Mapper.ym.InfomationMapper.getInfo",fetchType= FetchType.EAGER))})
    @Select("SELECT * from m_info limit #{index},#{pageSize}")
    public List<MInfo> showAllInfoNice(@Param("index") Integer index, @Param("pageSize") Integer pageSize);

    @Results({@Result(id=true,column="AutoID",property="autoId"),
            @Result(column = "UpFlag", property = "upFlag")})
    @Select("select * from l_uptoprovince where AutoID=#{AutoID}")
    public List<LUptoprovince> getInfo(@Param("AutoID") Integer autoId);




}
