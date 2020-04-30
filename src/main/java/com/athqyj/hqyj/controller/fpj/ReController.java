package com.athqyj.hqyj.controller.fpj;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.athqyj.hqyj.entity.MInfo;
import com.athqyj.hqyj.entity.SysUser;
import com.athqyj.hqyj.entity.Tbljxmarriageinfo;
import com.athqyj.hqyj.service.fpj.BfcService;
import com.athqyj.hqyj.service.fpj.ReService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
@RequestMapping("ruleExpand")
public class ReController {
    @Autowired
    private BfcService BfcService;
    @Autowired
    private ReService ReService;

    @RequestMapping("ruleExpand/nv")
    public String ruleExpandnv(Model Model){
        Model.addAttribute("sex","nv");
        return "ruleExpand";
    }

    @RequestMapping("ruleExpand/nan")
    public String ruleExpandnan(Model Model){
        Model.addAttribute("sex","nan");
        return "ruleExpand";
    }
    @GetMapping("GetRe.id")
    @ResponseBody
    public String  BfcQueryController(@RequestParam("ID")Long AutoId,@RequestParam("sex")String sex){
        System.out.println(sex+"==============================");
        Map<String, String> StringMap = new HashMap<String, String>();
        if(sex.equals("nv")){
            MInfo MInfo=BfcService.BfcqidService(AutoId);
            StringMap.put("ID",MInfo.getId());
            StringMap.put("fname",MInfo.getFname());
            StringMap.put("mname",MInfo.getMname());
            if (MInfo.getMjob()==1){
                StringMap.put("Mjob","农民");
            }
            if (MInfo.getMjob()==2){
                StringMap.put("Mjob","工人");
            }
            if (MInfo.getMjob()==3){
                StringMap.put("Mjob","服务生");
            }
            if (MInfo.getMjob()==4){
                StringMap.put("Mjob","经商");
            }
            if (MInfo.getMjob()==5){
                StringMap.put("Mjob","家务");
            }
            if (MInfo.getMjob()==6){
                StringMap.put("Mjob","教师/公务员/职员");
            }
            if (MInfo.getMjob()==7){
                StringMap.put("Mjob","其他");
            }
        }
        if(sex.equals("nan")){
            MInfo MInfo=BfcService.BfcqidService(AutoId);
            StringMap.put("ID",MInfo.getId());
            StringMap.put("fname",MInfo.getFname());
            StringMap.put("mname",MInfo.getMname());
            if (MInfo.getFjob()==1){
                StringMap.put("Fjob","农民");
            }
            if (MInfo.getFjob()==2){
                StringMap.put("Fjob","工人");
            }
            if (MInfo.getFjob()==3){
                StringMap.put("Fjob","服务生");
            }
            if (MInfo.getFjob()==4){
                StringMap.put("Fjob","经商");
            }
            if (MInfo.getFjob()==5){
                StringMap.put("Fjob","家务");
            }
            if (MInfo.getFjob()==6){
                StringMap.put("Fjob","教师/公务员/职员");
            }
            if (MInfo.getFjob()==7){
                StringMap.put("Fjob","其他");
            }
        }
        return JSONArray.toJSONString(StringMap);
    }

    @GetMapping("GetSysUser")
    @ResponseBody
    public String  SysUserQueryController(){
        Map<String, List<SysUser>> StringMap = new HashMap<String, List<SysUser>>();
        List<SysUser> SysUser=BfcService.sysuserQueryAllService();
        StringMap.put("data",SysUser);
        return JSONArray.toJSONString(StringMap);
    }

    @RequestMapping("addBfc")
    @ResponseBody
    public String addBfcController(@RequestParam(value = "allParams")String data){
        List<Object> list= JSON.parseArray(data,Object.class);
        String str=list.get(0)+"";
        String str1=list.get(1)+"";
        String str2=list.get(2)+"";
        String str3=list.get(3)+"";
        String str4=list.get(4)+"";
        String str5=list.get(5)+"";
        String str6=list.get(6)+"";
        String str7=list.get(7)+"";
        str=str.substring(1,str.length()-1).replaceAll("}","");
        str1=str1.substring(1,str1.length()-1).replaceAll("}","");
        str2=str2.substring(1,str2.length()-1).replaceAll("}","");
        str3=str3.substring(1,str3.length()-1).replaceAll("}","");
        str4=str4.substring(1,str4.length()-1).replaceAll("}","");
        str5=str5.substring(1,str5.length()-1).replaceAll("}","");
        str6=str6.substring(1,str6.length()-1).replaceAll("}","");
        str7=str7.substring(1,str7.length()-1).replaceAll("}","");
        String strall="[{"+str+","+str1+","+str2+","+str3+","+str4+","+str5+","+str6+","+str7+"}]";
        List<Tbljxmarriageinfo> lists= JSON.parseArray(strall,Tbljxmarriageinfo.class);
        Tbljxmarriageinfo tbljxmarriageinfo=new Tbljxmarriageinfo();
        for (int i=0;i<lists.size();i++){
            tbljxmarriageinfo.setId(lists.get(i).getId());
            tbljxmarriageinfo.setMSex(lists.get(i).getMSex());
            tbljxmarriageinfo.setIsJiWangBingShi(lists.get(i).getIsJiWangBingShi());
            tbljxmarriageinfo.setYiChuanXingJiBing((lists.get(i).getYiChuanXingJiBing()==null)?"0":lists.get(i).getYiChuanXingJiBing());
            tbljxmarriageinfo.setJingShenJiBing((lists.get(i).getJingShenJiBing()==null)?"0":lists.get(i).getJingShenJiBing());
            tbljxmarriageinfo.setXianTianXiangJiBing((lists.get(i).getXianTianXiangJiBing()==null)?"0":lists.get(i).getXianTianXiangJiBing());
            tbljxmarriageinfo.setChuanRanBing((lists.get(i).getChuanRanBing()==null)?"0":lists.get(i).getChuanRanBing());
            tbljxmarriageinfo.setXingBing((lists.get(i).getXingBing()==null)?"0":lists.get(i).getXingBing());
            tbljxmarriageinfo.setZhongYaoZangQi((lists.get(i).getZhongYaoZangQi()==null)?"0":lists.get(i).getZhongYaoZangQi());
            tbljxmarriageinfo.setMiNiaoXiTongShengZhiJiBing((lists.get(i).getMiNiaoXiTongShengZhiJiBing()==null)?"0":lists.get(i).getMiNiaoXiTongShengZhiJiBing());
            tbljxmarriageinfo.setJiBingName(lists.get(i).getJiBingName());
            tbljxmarriageinfo.setJingShenFaBingNum(lists.get(i).getJingShenFaBingNum());
            tbljxmarriageinfo.setJingShenFaBingDate(lists.get(i).getJingShenFaBingDate());
            tbljxmarriageinfo.setIsFuYao(lists.get(i).getIsFuYao());
            tbljxmarriageinfo.setSheHuiShengYingNengLi(lists.get(i).getSheHuiShengYingNengLi());
            if (lists.get(i).getShouShuShi().equals("手术室")){
                tbljxmarriageinfo.setShouShuShi("0");
            }else {
                tbljxmarriageinfo.setShouShuShi("1");
            };
            tbljxmarriageinfo.setShouShuName(lists.get(i).getShouShuName());
            tbljxmarriageinfo.setShouShuDate(lists.get(i).getShouShuDate());
            tbljxmarriageinfo.setXianBingShi((lists.get(i).getXianBingShi()==null)?"0":lists.get(i).getXianBingShi());
            tbljxmarriageinfo.setFeiHuoDongXingHbv((lists.get(i).getFeiHuoDongXingHbv()==null)?"0":lists.get(i).getFeiHuoDongXingHbv());
            tbljxmarriageinfo.setManXingHbv((lists.get(i).getManXingHbv()==null)?"0":lists.get(i).getManXingHbv());
            tbljxmarriageinfo.setMeiDuSuiFang((lists.get(i).getMeiDuSuiFang()==null)?"0":lists.get(i).getMeiDuSuiFang());
            tbljxmarriageinfo.setFeiJieHeSuiFang((lists.get(i).getFeiJieHeSuiFang()==null)?"0":lists.get(i).getFeiJieHeSuiFang());
            tbljxmarriageinfo.setXianBingQt((lists.get(i).getXianBingQt()==null)?"0":lists.get(i).getXianBingQt());
            tbljxmarriageinfo.setXianBingMiaoShu(lists.get(i).getXianBingMiaoShu());
            if (lists.get(i).getHunYunShi().equals("无")){
                tbljxmarriageinfo.setHunYunShi("0");
            }else if(lists.get(i).getHunYunShi().equals("有")){
                tbljxmarriageinfo.setHunYunShi("1");
            }else {
                tbljxmarriageinfo.setHunYunShi("2");
            }
            tbljxmarriageinfo.setXianYouNan(lists.get(i).getXianYouNan());
            tbljxmarriageinfo.setXianYouNv(lists.get(i).getXianYouNv());
            if(lists.get(i).getZiNvIsJiBing().equals("是")){
                tbljxmarriageinfo.setZiNvIsJiBing("0");
            }else {
                tbljxmarriageinfo.setZiNvIsJiBing("1");
            }
            tbljxmarriageinfo.setZiNvJiBingName(lists.get(i).getZiNvJiBingName());
            tbljxmarriageinfo.setHunJianDate(lists.get(i).getHunJianDate());
            tbljxmarriageinfo.setDengJidoctor(lists.get(i).getDengJidoctor());
        }
        Map<String,String> mapTF=new HashMap<>();
        if (ReService.AddReService(tbljxmarriageinfo)>0){
            mapTF.put("data","true");
        }else {
            mapTF.put("data","false");
        }
        return JSONArray.toJSONString(mapTF);
    }
}
