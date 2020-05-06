package com.athqyj.hqyj.Mapper.fpj;

import com.athqyj.hqyj.entity.MInfo;
import com.athqyj.hqyj.entity.Tblmarriageresult;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

@Mapper
public interface CbMapper {

    @Select("SELECT * FROM m_info WHERE id=#{id}")
    public MInfo QueryCbMapper(@Param("id")Long id);

    @Results({@Result(id=true,column = "ID",property = "id"),
            @Result(column = "ID",property ="MInfo", many = @Many(select = "com.athqyj.hqyj.Mapper.fpj.CbMapper.QueryCbMapper",fetchType= FetchType.EAGER))})
    @Select("select * from Tblmarriageresult where id=#{id} and sex=#{sex}")
    public Tblmarriageresult showAllTblmarriageresult(@Param("id")Long id, @Param("sex")String sex);

    @Select("SELECT * FROM m_info WHERE id=#{id}")
    public MInfo QueryCbsMapper(@Param("id")Long id);

    @Select("select count(*) from Tblmarriageresult where id=#{id} and sex=#{sex}")
    public int count(@Param("id")String id,@Param("sex")String sex);

    @Insert("INSERT into tblmarriageresult(ID,SEX,Result,ResultDes,Sickness,MedicalAdvice,PrenubileConsult,DirectResult,ChangeHospital,ChangeHospitalDate,ComeBackDate,ProvideDate,k1,k2,k3,k4,DotcorName,FillDate) " +
            "VALUES(#{id},#{sex},#{result},#{resultDes},#{sickness},#{medicalAdvice},#{prenubileConsult},#{directResult},#{changeHospital},#{changeHospitalDate},#{comeBackDate},#{provideDate},#{k1},#{k2},#{k3},#{k4},#{dotcorName},#{fillDate})")
    public int addcbMapper(Tblmarriageresult Tblmarriageresult);

    @Update("UPDATE tblmarriageresult set Result=#{result},ResultDes=#{resultDes},Sickness=#{sickness},MedicalAdvice=#{medicalAdvice},PrenubileConsult=#{prenubileConsult},DirectResult=#{directResult},ChangeHospital=#{changeHospital},ChangeHospitalDate=#{changeHospitalDate},ComeBackDate=#{comeBackDate},ProvideDate=#{provideDate},k1=#{k1},k2=#{k2},k3=#{k3},k4=#{k4},DotcorName=#{dotcorName},FillDate=#{fillDate}" +
            "WHERE ID=#{id} AND SEX=#{sex}")
    public int updcbMapper(Tblmarriageresult Tblmarriageresult);



}
