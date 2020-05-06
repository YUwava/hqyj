package com.athqyj.hqyj.Mapper.ym;

import com.athqyj.hqyj.entity.NvKaidan;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WomenKaiDanMapper {
    /*@Insert("insert  into `nv_kaidan`(`ID`,`ext_comp_1010`,`wclueCell`,`wcandidiasis`,`wtrichom`,`wcleanDegr`,`wwhiffTest`,`wphValue`,`wng`,`wct`,`agree`,`whb`,`wrbc`,`wplt`,`wwbc`,`wn`,`we`,`wb`,`wm`,`wl`,`midcell`,`wurt`,`ext_comp_1025`,`wabo`,`wrh`,`wbloodSugar`,`ext_comp_1031`,`whbsag`,`whbsab`,`whbeag`,`whbeab`,`whbcab`,`ext_comp_1039`,`walt`,`wcr`,`ext_comp_1044`,`wtsh`,`ext_comp_1048`,`wMGCIgG`,`wtreponema`,`wTOXOIgG`,`wMGCIgM`,`wRVIgG`,`wTOXOIgM`,`elseItem`,`realDoc`,`wcheckTime`,`psid`,`DUPFlag`,`DUpDate`) values \n" +
                "(#{id},'on','on','on','on','on','on','on',#{wng},#{wct}(10),'yes',#{whb},#{wrbc},#{wplt},#{wwbc},#{wn},#{we},#{wb},#{wm},#{wl}(20),#{midcell},#{wurt},NULL,'on','on',#{wbloodSugar},'on','on','on','on'(30),'on','on','on',#{walt},#{wcr},#{ext_comp_1044},'on','on','on','on'(40),'on','on','on','on','on',#{realDoc},now(),NULL,NULL,now())")*/
    @Insert("insert  into `nv_kaidan`(`ID`,`ext_comp_1010`,`wclueCell`,`wcandidiasis`,`wtrichom`,`wcleanDegr`,`wwhiffTest`,`wphValue`,`wng`,`wct`,`agree`,`whb`,`wrbc`,`wplt`,`wwbc`,`wn`,`we`,`wb`,`wm`,`wl`,`midcell`,`wurt`,`ext_comp_1025`,`wabo`,`wrh`,`wbloodSugar`,`ext_comp_1031`,`whbsag`,`whbsab`,`whbeag`,`whbeab`,`whbcab`,`ext_comp_1039`,`walt`,`wcr`,`ext_comp_1044`,`wtsh`,`ext_comp_1048`,`wMGCIgG`,`wtreponema`,`wTOXOIgG`,`wMGCIgM`,`wRVIgG`,`wTOXOIgM`,`elseItem`,`realDoc`,`wcheckTime`,`psid`,`DUPFlag`,`DUpDate`) values \n" +
            "(#{id},'on','on','on','on','on','on','on',#{wng},#{wct},'yes',#{whb},#{wrbc},#{wplt},#{wwbc},#{wn},#{we},#{wb},#{wm},#{wl},#{midcell},#{wurt},NULL,'on','on',#{wbloodSugar},'on','on','on','on','on','on','on',#{walt},#{wcr},#{extComp1044},'on','on','on','on','on','on','on','on','on',#{realDoc},now(),NULL,NULL,now())")
    public int addInfo(NvKaidan kaidan);
}
