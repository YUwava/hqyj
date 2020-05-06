package com.athqyj.hqyj.Mapper.fpj;

import com.athqyj.hqyj.entity.Tbljxmarriageinfo;
import com.athqyj.hqyj.entity.Tblxray;
import org.apache.ibatis.annotations.*;

@Mapper
public interface XbcMapper {

    @Select("SELECT * FROM tblxray where ID=#{AutoId} and SEX=#{sex}")
    public Tblxray QueryxbcMapper(@Param("AutoId")Long AutoId,@Param("sex")String sex);

    @Insert("INSERT into tblxray(ID,SEX,XrayID,XrayShow,IsNormal,UnusualDes,Doctor,ExaminationDate) " +
            "VALUES(#{id},#{sex},#{xrayId},#{xrayShow},#{isNormal},#{unusualDes},#{doctor},#{examinationDate})")
    public int AddXbcMapper(Tblxray Tblxray);

    @Select("select count(*) from tblxray where id=#{id} and sex=#{sex}")
    public int count(@Param("id")String id, @Param("sex")String sex);

    @Update("UPDATE tblxray set xrayId=#{xrayId},xrayShow=#{xrayShow},isNormal=#{isNormal},unusualDes=#{unusualDes},doctor=#{doctor},examinationDate=#{examinationDate}" +
            "WHERE ID=#{id} AND sex=#{sex}")
    public int updXbcMapper(Tblxray Tblxray);
}
