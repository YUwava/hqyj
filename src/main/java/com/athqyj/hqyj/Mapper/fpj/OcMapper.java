package com.athqyj.hqyj.Mapper.fpj;

import com.athqyj.hqyj.entity.Tblmouth;
import com.athqyj.hqyj.entity.Tblxray;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface OcMapper {

    @Select("SELECT * FROM tblmouth where ID=#{AutoId} and SEX=#{sex}")
    public Tblmouth QueryOCMapper(@Param("AutoId")Long AutoId, @Param("sex")String sex);

    @Insert("INSERT into tblmouth(ID,SEX,CheckDev,CheckShow,IsNormal,UnusualDes,Doctor,ExaminationDate) " +
            "VALUES(#{id},#{sex},#{checkDev},#{checkShow},#{isNormal},#{unusualDes},#{doctor},#{examinationDate})")
    public int AddOcMapper(Tblmouth Tblmouth);
}
