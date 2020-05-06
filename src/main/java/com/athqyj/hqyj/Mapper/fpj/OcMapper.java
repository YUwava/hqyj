package com.athqyj.hqyj.Mapper.fpj;

import com.athqyj.hqyj.entity.Tblmouth;
import com.athqyj.hqyj.entity.Tblxray;
import org.apache.ibatis.annotations.*;

@Mapper
public interface OcMapper {

    @Select("SELECT * FROM tblmouth where ID=#{AutoId} and SEX=#{sex}")
    public Tblmouth QueryOCMapper(@Param("AutoId")Long AutoId, @Param("sex")String sex);

    @Insert("INSERT into tblmouth(ID,SEX,CheckDev,CheckShow,IsNormal,UnusualDes,Doctor,ExaminationDate) " +
            "VALUES(#{id},#{sex},#{checkDev},#{checkShow},#{isNormal},#{unusualDes},#{doctor},#{examinationDate})")
    public int AddOcMapper(Tblmouth Tblmouth);

    @Select("select count(*) from tblmouth where id=#{id} and sex=#{sex}")
    public int count(@Param("id")String id, @Param("sex")String sex);

    @Update("UPDATE tblmouth set checkDev=#{checkDev},CheckShow=#{checkShow},isNormal=#{isNormal},unusualDes=#{unusualDes},doctor=#{doctor},examinationDate=#{examinationDate}" +
            "WHERE ID=#{id} AND sex=#{sex}")
    public int updOcMapper(Tblmouth Tblmouth);


}
