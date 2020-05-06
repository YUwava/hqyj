package com.athqyj.hqyj.Mapper.ym;

import com.athqyj.hqyj.entity.NvTigejiancha;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Controller;
@Mapper
public interface WomenexamMapper {
    /*@Insert("insert  into `nv_tigejiancha`(`ID`,`height`,`weight`,`bmi`,`heartRate`,`hightBloodPressure`,`lowBloodPressure`,`psycology`,`psycologyDtls`,`retardation`,`knowledge`,`judge`,`memory`,`caculate`,`facialFeature`,`facialFeatureDtls`,`specialBody`,`specialBodyDtls`,`specisalLook`,`specialLookDtls`,`skin`,`skinDtls`,`thyroid`,`thyroidDtls`,`lung`,`lungDtls`,`heartRhythm`,`heartRhythmDtls`,`heartmurmur`,`heartmurmurDtls`,`liver`,`liverDtls`,`shufflingGait`,`shufflingGaitDtls`,`otherItems`,`realDoc`,`examineDate`,`pubes`,`pubeDtls`,`breast`,`breastDtls`,`vulva`,`vulvaDtls`,`vagina`,`vaginaDtls`,`secretions`,`secretionsDtls`,`cervix`,`cervixDtls`,`uterusSize`,`uterusAct`,`uterusBump`,`uterusBumpDtls`,`uterusAdnexa`,`uterusAdnexaDtls`,`otherItems2`,`realDoc2`,`examineDate2`,`DUpDate`,`DUPFlag`,`isCheck`,`uncheckReason`) values \n" +
            "(#{id},#{height},#{weight},#{bmi},#{heartRate},#{hightBloodPressure},#{lowBloodPressure},#{psycology},#{psycologyDtls},#{retardation}(10),#{knowledge},#{judge},#{memory},#{caculate},#{facialFeature},#{facialFeatureDtls},#{specialBody},#{specialBodyDtls},#{specisalLook},#{specialLookDtls}(20),#{skin},#{skinDtls},NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL(30),'未触及',NULL,'正常',NULL,NULL,NULL,NULL,'正常',NULL,'正常(40)',NULL,'正常',NULL,'未见异常',NULL,NULL,NULL,'光滑',NULL,'正常'(50),'好','无',NULL,'未见异常',NULL,NULL,#{realDoc2},NULL,NULL,NULL,NULL,NULL)")*/
    @Insert("insert  into `nv_tigejiancha`(`ID`,`height`,`weight`,`bmi`,`heartRate`,`hightBloodPressure`,`lowBloodPressure`,`psycology`,`psycologyDtls`,`retardation`,`knowledge`,`judge`,`memory`,`caculate`,`facialFeature`,`facialFeatureDtls`,`specialBody`,`specialBodyDtls`,`specisalLook`,`specialLookDtls`,`skin`,`skinDtls`,`thyroid`,`thyroidDtls`,`lung`,`lungDtls`,`heartRhythm`,`heartRhythmDtls`,`heartmurmur`,`heartmurmurDtls`,`liver`,`liverDtls`,`shufflingGait`,`shufflingGaitDtls`,`otherItems`,`realDoc`,`examineDate`,`pubes`,`pubeDtls`,`breast`,`breastDtls`,`vulva`,`vulvaDtls`,`vagina`,`vaginaDtls`,`secretions`,`secretionsDtls`,`cervix`,`cervixDtls`,`uterusSize`,`uterusAct`,`uterusBump`,`uterusBumpDtls`,`uterusAdnexa`,`uterusAdnexaDtls`,`otherItems2`,`realDoc2`,`examineDate2`,`DUpDate`,`DUPFlag`,`isCheck`,`uncheckReason`) values \n" +
            "(#{id},#{height},#{weight},#{bmi},#{heartRate},#{hightBloodPressure},#{lowBloodPressure},#{psycology},#{psycologyDtls},#{retardation},#{knowledge},#{judge},#{memory},#{caculate},#{facialFeature},#{facialFeatureDtls},#{specialBody},#{specialBodyDtls},#{specisalLook},#{specialLookDtls},#{skin},#{skinDtls},NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'未触及',NULL,'正常',NULL,NULL,NULL,now(),'正常',NULL,'正常',NULL,'正常',NULL,'未见异常',NULL,NULL,NULL,'光滑',NULL,'正常','好','无',NULL,'未见异常',NULL,NULL,#{realDoc2},now(),NULL,NULL,NULL,NULL)")
    public int addInfo(NvTigejiancha nvTigejiancha);
}
