package com.athqyj.hqyj.Mapper.fpj;

import com.athqyj.hqyj.entity.Tbljxmarriageinfo;
import com.athqyj.hqyj.entity.Tblmarriageresult;
import org.apache.ibatis.annotations.*;

@Mapper
public interface ReMapper {

    @Insert("INSERT INTO tbljxmarriageinfo(ID,m_sex,IsJiWangBingShi,YiChuanXingJiBing,JingShenJiBing,XianTianXiangJiBing,ChuanRanBing,XingBing,ZhongYaoZangQi,MiNiaoXiTongShengZhiJiBing,JiBingName,JingShenFaBingNum,JingShenFaBingDate,IsFuYao,SheHuiShengYingNengLi,ShouShuShi,ShouShuName,ShouShuDate,XianBingShi,FeiHuoDongXingHBV,ManXingHBV,MeiDuSuiFang,FeiJieHeSuiFang,XianBingQt,XianBingMiaoShu,HunYunShi,XianYouNan,XianYouNv,ZiNvIsJiBing,ZiNvJiBingName,HunJianDate,DengJidoctor) " +
            "VALUES(#{id},#{mSex},#{isJiWangBingShi},#{yiChuanXingJiBing},#{jingShenJiBing},#{xianTianXiangJiBing},#{chuanRanBing},#{xingBing},#{zhongYaoZangQi},#{miNiaoXiTongShengZhiJiBing},#{jiBingName},#{jingShenFaBingNum},#{jingShenFaBingDate},#{isFuYao},#{sheHuiShengYingNengLi},#{shouShuShi},#{shouShuName},#{shouShuDate},#{xianBingShi},#{feiHuoDongXingHbv},#{manXingHbv},#{meiDuSuiFang},#{feiJieHeSuiFang},#{xianBingQt},#{xianBingMiaoShu},#{hunYunShi},#{xianYouNan},#{xianYouNv},#{ziNvIsJiBing},#{ziNvJiBingName},#{hunJianDate},#{dengJidoctor})")
    public int addReMapper(Tbljxmarriageinfo tbljxmarriageinfo);

    @Select("select count(*) from tbljxmarriageinfo where id=#{id} and m_sex=#{sex}")
    public int count(@Param("id")String id, @Param("sex")String sex);

    @Update("UPDATE Tbljxmarriageinfo set isJiWangBingShi=#{isJiWangBingShi},yiChuanXingJiBing=#{yiChuanXingJiBing},jingShenJiBing=#{jingShenJiBing},xianTianXiangJiBing=#{xianTianXiangJiBing},chuanRanBing=#{chuanRanBing},xingBing=#{xingBing},zhongYaoZangQi=#{zhongYaoZangQi},miNiaoXiTongShengZhiJiBing=#{miNiaoXiTongShengZhiJiBing},jiBingName=#{jiBingName},jingShenFaBingNum=#{jingShenFaBingNum},jingShenFaBingDate=#{jingShenFaBingDate},isFuYao=#{isFuYao},sheHuiShengYingNengLi=#{sheHuiShengYingNengLi},shouShuShi=#{shouShuShi},shouShuName=#{shouShuName},shouShuDate=#{shouShuDate},xianBingShi=#{xianBingShi},feiHuoDongXingHbv=#{feiHuoDongXingHbv},manXingHbv=#{manXingHbv},meiDuSuiFang=#{meiDuSuiFang},feiJieHeSuiFang=#{feiJieHeSuiFang},xianBingQt=#{xianBingQt},xianBingMiaoShu=#{xianBingMiaoShu},hunYunShi=#{hunYunShi},xianYouNan=#{xianYouNan},xianYouNv=#{xianYouNv},ziNvJiBingName=#{ziNvIsJiBing},ziNvJiBingName=#{ziNvJiBingName},hunJianDate=#{hunJianDate},dengJidoctor=#{dengJidoctor}" +
            "WHERE ID=#{id} AND m_sex=#{mSex}")
    public int updReMapper(Tbljxmarriageinfo tbljxmarriageinfo);
}
