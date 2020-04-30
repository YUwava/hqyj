package com.athqyj.hqyj.Mapper.fpj;

import com.athqyj.hqyj.entity.Tblxray;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface XbcMapper {

    @Select("SELECT * FROM tblxray where ID=#{AutoId} and SEX=#{sex}")
    public Tblxray QueryxbcMapper(@Param("AutoId")Long AutoId,@Param("sex")String sex);

    @Insert("INSERT into tblxray(ID,SEX,XrayID,XrayShow,IsNormal,UnusualDes,Doctor,ExaminationDate) " +
            "VALUES(#{id},#{sex},#{xrayId},#{xrayShow},#{isNormal},#{unusualDes},#{doctor},#{examinationDate})")
    public int AddXbcMapper(Tblxray Tblxray);
}
