package com.athqyj.hqyj.Mapper.fpj;

import com.athqyj.hqyj.entity.Tbljxmarriageinfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReMapper {

    @Insert("INSERT INTO tbljxmarriageinfo(ID,m_sex,IsJiWangBingShi,YiChuanXingJiBing,JingShenJiBing,XianTianXiangJiBing,ChuanRanBing,XingBing,ZhongYaoZangQi,MiNiaoXiTongShengZhiJiBing,JiBingName,JingShenFaBingNum,JingShenFaBingDate,IsFuYao,SheHuiShengYingNengLi,ShouShuShi,ShouShuName,ShouShuDate,XianBingShi,FeiHuoDongXingHBV,ManXingHBV,MeiDuSuiFang,FeiJieHeSuiFang,XianBingQt,XianBingMiaoShu,HunYunShi,XianYouNan,XianYouNv,ZiNvIsJiBing,ZiNvJiBingName,HunJianDate,DengJidoctor) " +
            "VALUES(#{id},#{mSex},#{isJiWangBingShi},#{yiChuanXingJiBing},#{jingShenJiBing},#{xianTianXiangJiBing},#{chuanRanBing},#{xingBing},#{zhongYaoZangQi},#{miNiaoXiTongShengZhiJiBing},#{jiBingName},#{jingShenFaBingNum},#{jingShenFaBingDate},#{isFuYao},#{sheHuiShengYingNengLi},#{shouShuShi},#{shouShuName},#{shouShuDate},#{xianBingShi},#{feiHuoDongXingHbv},#{manXingHbv},#{meiDuSuiFang},#{feiJieHeSuiFang},#{xianBingQt},#{xianBingMiaoShu},#{hunYunShi},#{xianYouNan},#{xianYouNv},#{ziNvIsJiBing},#{ziNvJiBingName},#{hunJianDate},#{dengJidoctor})")
    public int addReMapper(Tbljxmarriageinfo tbljxmarriageinfo);
}
