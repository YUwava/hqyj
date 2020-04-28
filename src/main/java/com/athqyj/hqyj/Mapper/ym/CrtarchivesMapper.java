package com.athqyj.hqyj.Mapper.ym;

import com.athqyj.hqyj.entity.MInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CrtarchivesMapper {

    /*新增人员信息*/
    @Insert("insert  into `m_info`(`id`,`mname`,`mnationality`,`midCardType`,`midCard`,`mbirthDate`,`mage`,`meduLevel`,`mjob`,`mcellPhoneNum`,`maccountType`,`phoneNum`,`fname`,`fnationality`,`fidCardType`,`fidCard`,`fbirthDate`,`fage`,`feduLevel`,`fjob`,`faccountType`,`fcellPhoneNum`,`mtime`,`maccountLocationProvince`,`maccountLocationCity`,`maccountLocationCounty`,`maccountLocationCountry`,`maccountLocationVillage`,`faccountLocationProvince`,`faccountLocationCity`,`faccountLocationCounty`,`faccountLocationCountry`,`faccountLocationVillage`,`addressProvince`,`addressCity`,`addressCounty`,`addressCountry`,`addressVillage`,`postCode`,`doctorName`,`serviceTime`,`psid`,`remindLocationId`,`hasContent`,`DUpDate`,`DUPFlag`,`faddress`,`maddress`,`mjobOthers`,`fjobOthers`,`preID`,`emailN`,`emailW`,`wechatN`,`wechatW`,`QQN`,`QQW`,`floatPopulation`) values \n" +
            "(#{id},#{mname},'汉族',1,#{midCard},#{mbirthDate},#{mage},'3',1,#{mcellPhoneNum},1,#{phoneNum},#{fname},'汉族',1,#{fidCard},#{fbirthDate},#{fage},4,1,1,'66666666666',#{mtime},#{maccountLocationProvince},#{maccountLocationCity},#{maccountLocationCounty},null,null,#{faccountLocationProvince},#{faccountLocationCity},#{faccountLocationCounty},'发财村','发财村','发财村','发财村','发财村','发财村','发财村',#{postCode},#{doctorName},now(),'ff8080815c2f0a4d015ce8d0187d4f25q','ff808081399baa5101399bad69ca00b3',4,NOW(),'1','湖南省长沙市珠宝村发财湾','湖南省长沙市发财湾致富村',null,null,'4301810001706666',#{emailN},#{emailW},#{wechatN},#{wechatW},#{qqn},#{qqw},'0')")
    public int addPeopleInfo(MInfo mInfo);

}
