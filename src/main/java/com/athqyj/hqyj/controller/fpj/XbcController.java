package com.athqyj.hqyj.controller.fpj;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.athqyj.hqyj.entity.MInfo;
import com.athqyj.hqyj.entity.Tblxray;
import com.athqyj.hqyj.service.fpj.BfcService;
import com.athqyj.hqyj.service.fpj.ReService;
import com.athqyj.hqyj.service.fpj.XbcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("xRayCheck")
public class XbcController {

    @Autowired
    private BfcService BfcService;
    @Autowired
    private XbcService XbcService;
    @RequestMapping("xRayCheck/nv")
    public String ruleExpandnv(Model Model){
        Model.addAttribute("sex","nv");
        return "xRayCheck";
    }

    @RequestMapping("xRayCheck/nan")
    public String ruleExpandnan(Model Model){
        Model.addAttribute("sex","nan");
        return "xRayCheck";
    }

    @GetMapping("GetXbC.id")
    @ResponseBody
    public String  GetXbCGETController(@RequestParam("ID")Long AutoId, @RequestParam("sex")String sex,@RequestParam("IDS")Long ids){
        Map<String, String> StringMap = new HashMap<String, String>();
        if(sex.equals("nv")){
            Tblxray Tblxray=XbcService.QueryxbcService(AutoId,"女");
            MInfo MInfo=BfcService.BfcqidService(AutoId);
            StringMap.put("id",MInfo.getId());
            StringMap.put("mname",MInfo.getFname());
            if (Tblxray!=null){

                StringMap.put("XrayID",Tblxray.getXrayId());
                StringMap.put("XrayShow",Tblxray.getXrayShow());
                StringMap.put("IsNormal",Tblxray.getIsNormal()+"");
                StringMap.put("UnusualDes",Tblxray.getUnusualDes());
                StringMap.put("Doctor",Tblxray.getDoctor());
                StringMap.put("ExaminationDate",Tblxray.getExaminationDate()+"");
            }

        }
        if(sex.equals("nan")){
            Tblxray Tblxray=XbcService.QueryxbcService(AutoId,"男");
            MInfo MInfo=BfcService.BfcqidService(AutoId);
            StringMap.put("id",MInfo.getId());
            StringMap.put("mname",MInfo.getMname());
            if (Tblxray!=null){
                StringMap.put("XrayID",Tblxray.getXrayId());
                StringMap.put("XrayShow",Tblxray.getXrayShow());
                StringMap.put("IsNormal",Tblxray.getIsNormal()+"");
                StringMap.put("UnusualDes",Tblxray.getUnusualDes());
                StringMap.put("Doctor",Tblxray.getDoctor());
                StringMap.put("ExaminationDate",Tblxray.getExaminationDate()+"");
            }

        }
        return JSONArray.toJSONString(StringMap);
    }

    @RequestMapping("addXbc")
    @ResponseBody
    public String addBfcController(@RequestParam(value = "allParams")String data,@RequestParam("sex") String sex) {
        List<Tblxray> list = JSON.parseArray(data, Tblxray.class);
        Tblxray Tblxray=new Tblxray();
        Map<String,String> mapTF=new HashMap<>();
        if(sex.equals("nv")){
            for (int i=0;i<list.size();i++){
                Tblxray.setId(list.get(i).getId());
                Tblxray.setSex("女");
                Tblxray.setXrayId(list.get(i).getXrayId());
                Tblxray.setXrayShow(list.get(i).getXrayShow());
                Tblxray.setIsNormal(list.get(i).getIsNormal());
                Tblxray.setIsNormal(list.get(i).getIsNormal());
                Tblxray.setUnusualDes(list.get(i).getUnusualDes());
                if (list.get(i).getDoctor().equals("2")){
                    Tblxray.setDoctor("管理员");
                }
                Tblxray.setExaminationDate(list.get(i).getExaminationDate());
            }
            int count=XbcService.count(Tblxray.getId(),Tblxray.getSex());
            if (count==1){
                if (XbcService.updXbcService(Tblxray)>0){
                    mapTF.put("data","true");
                }else {
                    mapTF.put("data","false");
                }
            }else {
                if (XbcService.AddXbcService(Tblxray)>0){
                    mapTF.put("data","true");
                }else {
                    mapTF.put("data","false");
                }
            }


        }else if(sex.equals("nan")){
            for (int i=0;i<list.size();i++){
                Tblxray.setId(list.get(i).getId());
                Tblxray.setSex("男");
                Tblxray.setXrayId(list.get(i).getXrayId());
                Tblxray.setXrayShow(list.get(i).getXrayShow());
                Tblxray.setIsNormal(list.get(i).getIsNormal());
                Tblxray.setIsNormal(list.get(i).getIsNormal());
                Tblxray.setUnusualDes(list.get(i).getUnusualDes());
                if (list.get(i).getDoctor().equals("2")){
                    Tblxray.setDoctor("管理员");
                }
                Tblxray.setExaminationDate(list.get(i).getExaminationDate());
            }
            int count=XbcService.count(Tblxray.getId(),Tblxray.getSex());
            if (count==1){
                if (XbcService.updXbcService(Tblxray)>0){
                    mapTF.put("data","true");
                }else {
                    mapTF.put("data","false");
                }
            }else {
                if (XbcService.AddXbcService(Tblxray)>0){
                    mapTF.put("data","true");
                }else {
                    mapTF.put("data","false");
                }
            }
        }


        return JSONArray.toJSONString(mapTF);
    }

}
