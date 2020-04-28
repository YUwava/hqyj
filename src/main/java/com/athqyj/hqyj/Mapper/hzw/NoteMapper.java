package com.athqyj.hqyj.Mapper.hzw;

import com.athqyj.hqyj.entity.LUptoprovince;
import com.athqyj.hqyj.entity.MInfo;
import com.athqyj.hqyj.entity.NvPinggujianyi;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;
@Mapper
public interface NoteMapper /*extends tk.mybatis.mapper.common.Mapper<MInfo>*/{
    /*查询总条数*/
    @Select("select count(*) from m_info")
    public int allcount();


    /*评估建议sql查询*/
    @Results({@Result(id=true,column = "ID",property = "id"),
            @Result(column = "evaluateResultDetail", property = "evaluateResultDetail"),
            @Result(column = "ID",property ="nvPinggujianyis", many = @Many(select = "com.athqyj.hqyj.Mapper.hzw.NoteMapper.getInfo",fetchType= FetchType.EAGER))})
    /*查询所有用户*/
    @Select("select * from m_info  limit #{index},#{pageSize}")
    public List<MInfo> showAllMInfo(@Param("index") Integer index, @Param("pageSize") Integer pageSize);

    @Results({@Result(id=true,column="ID",property="id"),
            @Result(column = "evaluateResultDetail", property = "evaluateResultDetail")})
    @Select("select * from nv_pinggujianyi where ID=#{ID}")
    public List<NvPinggujianyi> getInfo(@Param("ID") long id);









}
