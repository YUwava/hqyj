package com.athqyj.hqyj.Mapper.hzw;

import com.athqyj.hqyj.entity.LUptoprovince;
import com.athqyj.hqyj.entity.MInfo;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;
import java.util.Map;

@Mapper
public interface QueryFileInformationMapper {
    /*分页查询*/
    @Select("select * from m_info")
    public List<MInfo> showInfoPage(@Param("index") Integer index,@Param("pageSize") Integer pageSize);



    /*查询总条数*/
    @Select("select count(*) from m_info")
    public int allcount();

    /*连表查询人员信息*/
    @Results({@Result(id=true,column = "AutoID",property = "autoId"),
            @Result(column = "UpFlag", property = "upFlag"),
            @Result(column = "AutoID",property ="lUptoprovince", many = @Many(select = "com.athqyj.hqyj.Mapper.hzw.QueryFileInformationMapper.getInfo",fetchType= FetchType.EAGER))})

    @Select("SELECT * from m_info where fname like '%${fname}%' and serviceTime like '%${serviceTime}%' and fidCard like '%${fidCard}%' and midCard like '%${midCard}%' and mname like '%${mname}%' and fbirthDate like '%${fbirthDate}%' and mbirthDate like '%${mbirthDate}%' limit #{index},#{pageSize}")
    public List<MInfo> showAllInfoNice(@Param("index") Integer index,
                                       @Param("pageSize") Integer pageSize,
                                       @Param("fname") String fname,
                                       @Param("serviceTime") String serviceTime,
                                       @Param("fidCard") String fidCard,
                                       @Param("midCard") String midCard,
                                       @Param("mname") String mname,
                                       @Param("fbirthDate") String fbirthDate,
                                       @Param("mbirthDate") String mbirthDate);






    @Results({@Result(id=true,column="AutoID",property="autoId"),
            @Result(column = "UpFlag", property = "upFlag")})

    @Select("select * from l_uptoprovince where AutoID=#{AutoID}")
    public List<LUptoprovince> getInfo(@Param("AutoID") Integer autoId);

}
