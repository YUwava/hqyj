package com.athqyj.hqyj.Mapper.fpj;

import com.athqyj.hqyj.entity.MInfo;
import com.athqyj.hqyj.entity.SysUser;
import com.athqyj.hqyj.entity.Tblmarriageresult;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

@Mapper
public interface BfcMapper {
    @Select("SELECT * from m_info where id=#{AutoId}")
    public MInfo BfcIdQuery(@Param("AutoId")Long AutoId);

    @Select("SELECT * FROM sys_user")
    public List<SysUser> sysuserQueryAll();

    @Select("SELECT * FROM m_info WHERE id=#{id}")
    public MInfo QueryBfcMapper(@Param("id")Long id);

    @Results({@Result(id=true,column = "ID",property = "id"),
            @Result(column = "ID",property ="MInfo", many = @Many(select = "com.athqyj.hqyj.Mapper.fpj.BfcMapper.QueryBfcsMapper",fetchType= FetchType.EAGER))})
    @Select("select * from Tblmarriageresult where id=#{id} and sex=#{sex}")
    public Tblmarriageresult showAllTblmarriageresult(@Param("id")Long id, @Param("sex")String sex);

    @Select("SELECT * FROM m_info WHERE id=#{id}")
    public MInfo QueryBfcsMapper(@Param("id")Long id);

    @Select("select count(*) from Tblmarriageresult where id=#{id} and sex=#{sex}")
    public int count(@Param("id")String id,@Param("sex")String sex);

    @Insert("INSERT into tblmarriageresult(ID,SEX,Result,ResultDes,Sickness,MedicalAdvice,PrenubileConsult,DirectResult,ChangeHospital,ChangeHospitalDate,ComeBackDate,ProvideDate,k1,k2,k3,k4,DotcorName,FillDate) " +
            "VALUES(#{id},#{sex},#{result},#{resultDes},#{sickness},#{medicalAdvice},#{prenubileConsult},#{directResult},#{changeHospital},#{changeHospitalDate},#{comeBackDate},#{provideDate},#{k1},#{k2},#{k3},#{k4},#{dotcorName},#{fillDate})")
    public int addcbMapper(Tblmarriageresult Tblmarriageresult);

    @Update("UPDATE tblmarriageresult set Result=#{result},ResultDes=#{resultDes},MedicalAdvice=#{medicalAdvice}" +
            "WHERE ID=#{id} AND SEX=#{sex}")
    public int updBfcMapper(Tblmarriageresult Tblmarriageresult);
}
