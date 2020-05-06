package com.athqyj.hqyj.Mapper.ym;

import com.athqyj.hqyj.entity.NanTigejiancha;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ManexamMapper {
    @Insert("insert  into `nan_tigejiancha`(`ID`,`height`,`weight`,`bmi`,`heartRate`,`hightBloodPressure`,`lowBloodPressure`,`psycology`,`psycologyDtls`,`retardation`,`knowledge`,`judge`,`memory`,`caculate`,`facialFeature`,`facialFeatureDtls`,`specialBody`,`specialBodyDtls`,`specisalLook`,`specialLookDtls`,`skin`,`skinDtls`,`thyroid`,`thyroidDtls`,`lung`,`lungDtls`,`heartRhythm`,`heartRhythmDtls`,`heartmurmur`,`heartmurmurDtls`,`liver`,`liverDtls`,`shufflingGait`,`shufflingGaitDtls`,`otherItems`,`doctor`,`examineDate`,`pubes`,`pubeDtls`,`bugeMonggon`,`bugeMonggonDtls`,`penis`,`penisDtls`,`prepuce`,`orchis`,`leftOrchisPalpableCapacit`,`rightOrchisPalpableCapaci`,`epididymis`,`epididymisDtls`,`seminalDuct`,`seminalDuctDtls`,`subclinicalVaricocele`,`subclinicalVaricoceleDegr`,`subclinicalVaricoceleSpot`,`otherItems2`,`doctor2`,`examineDate2`,`DUpDate`,`DUPFlag`,`isCheck`,`uncheckReason`) values \n" +
            "(#{id},#{height},#{weight},#{bmi},#{heartRate},#{hightBloodPressure},#{lowBloodPressure},#{psycology},#{psycologyDtls},#{retardation},#{knowledge},#{judge},#{memory},#{caculate},#{facialFeature},#{facialFeatureDtls},#{specialBody},#{specialBodyDtls},#{specisalLook},#{specialLookDtls},#{skin},#{skinDtls},NULL,NULL,NULL,NULL,NULL,NULL,NULL,'未触及',NULL,'正常',NULL,NULL,NULL,NULL,now(),NULL,'正常',NULL,'正常',NULL,'未见异常',NULL,NULL,NULL,NULL,NULL,'正常','好','无',NULL,'未见异常',NULL,NULL,#{doctor2},now(),NULL,NULL,NULL,NULL)")
    public int addInfo(NanTigejiancha nanTigejiancha);
}
