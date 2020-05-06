package com.athqyj.hqyj.Mapper.ym;

import com.athqyj.hqyj.entity.NanKaidan;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ManKaiDanMapper {
    @Insert("insert  into `nan_kaidan`(`ID`,`ext_comp_1009`,`mabo`,`mrh`,`murt`,`mtreponema`,`ext_comp_1015`,`mhbsag`,`mhbsab`,`mhbeag`,`mhbeab`,`mhbcab`,`ext_comp_1023`,`malt`,`mcr`,`elseItem`,`realDoc`,`mcheckTime`,`DUpDate`,`DUPFlag`) values \n" +
            "(#{id},'on',#{mabo},#{mrh},#{murt},#{mtreponema},'on',#{mhbsag},#{mhbsab},#{mhbeag},#{mhbeab},#{mhbcab},#{extComp1023},#{malt},#{mcr},#{elseItem},#{realDoc},now(),now(),NULL)")
    public int addInfo(NanKaidan nanKaidan);
}
