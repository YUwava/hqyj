package com.athqyj.hqyj.controller.fpj;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.athqyj.hqyj.entity.MInfo;
import com.athqyj.hqyj.entity.Tblmouth;
import com.athqyj.hqyj.entity.Tblxray;
import com.athqyj.hqyj.service.fpj.BfcService;
import com.athqyj.hqyj.service.fpj.OcService;
import com.athqyj.hqyj.service.fpj.XbcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("oralCheck")
public class OcController {

    @Autowired
    private BfcService BfcService;

    @Autowired
    private OcService OcService;


    @RequestMapping("oralCheck/nv")
    public String ruleExpandnv(Model Model){
        Model.addAttribute("sex","nv");
        return "oralCheck";
    }

    @RequestMapping("oralCheck/nan")
    public String ruleExpandnan(Model Model){
        Model.addAttribute("sex","nan");
        return "oralCheck";
    }

    @GetMapping("GetXOc.id")
    @ResponseBody
    public String  GetXbCGETController(@RequestParam("ID")Long AutoId, @RequestParam("sex")String sex, @RequestParam("IDS")Long ids){
        Map<String, String> StringMap = new HashMap<String, String>();
        if(sex.equals("nv")){
            Tblmouth Tblmouth=OcService.QueryOcService(ids,"女");
            MInfo MInfo= BfcService.BfcqidService(AutoId);
            StringMap.put("id",MInfo.getId());
            StringMap.put("mname",MInfo.getFname());
            if (Tblmouth!=null){
                StringMap.put("CheckDev",Tblmouth.getCheckDev());
                StringMap.put("CheckShow",Tblmouth.getCheckShow());
                StringMap.put("IsNormal",Tblmouth.getIsNormal()+"");
                StringMap.put("UnusualDes",Tblmouth.getUnusualDes());
                StringMap.put("Doctor",Tblmouth.getDoctor());
                StringMap.put("ExaminationDate",Tblmouth.getExaminationDate()+"");
            }

        }
        if(sex.equals("nan")){
            Tblmouth Tblmouth=OcService.QueryOcService(ids,"男");
            MInfo MInfo=BfcService.BfcqidService(AutoId);
            StringMap.put("id",MInfo.getId());
            StringMap.put("mname",MInfo.getMname());
            if (Tblmouth!=null){
                StringMap.put("CheckDev",Tblmouth.getCheckDev());
                StringMap.put("CheckShow",Tblmouth.getCheckShow());
                StringMap.put("IsNormal",Tblmouth.getIsNormal()+"");
                StringMap.put("UnusualDes",Tblmouth.getUnusualDes());
                StringMap.put("Doctor",Tblmouth.getDoctor());
                StringMap.put("ExaminationDate",Tblmouth.getExaminationDate()+"");
            }

        }
        return JSONArray.toJSONString(StringMap);
    }

    @RequestMapping("addOc")
    @ResponseBody
    public String addBfcController(@RequestParam(value = "allParams")String data,@RequestParam("sex")String sex) {
        List<Tblmouth> list = JSON.parseArray(data, Tblmouth.class);
        Tblmouth Tblmouth=new Tblmouth();
        Map<String,String> mapTF=new HashMap<>();
        if (sex.equals("nv")){
            for (int i=0;i<list.size();i++){
                Tblmouth.setId(list.get(i).getId());
                Tblmouth.setSex("女");
                Tblmouth.setCheckDev(list.get(i).getCheckDev());
                Tblmouth.setIsNormal(list.get(i).getIsNormal());
                Tblmouth.setIsNormal(list.get(i).getIsNormal());
                Tblmouth.setUnusualDes(list.get(i).getUnusualDes());
                if (list.get(i).getDoctor().equals(1)){
                    Tblmouth.setDoctor("管理员");
                }
                Tblmouth.setExaminationDate(list.get(i).getExaminationDate());
            }

            if (OcService.AddOccService(Tblmouth)>0){
                mapTF.put("data","true");
            }else {
                mapTF.put("data","false");
            }
        }else if (sex.equals("nan")){
            for (int i=0;i<list.size();i++){
                Tblmouth.setId(list.get(i).getId());
                Tblmouth.setSex("男");
                Tblmouth.setCheckDev(list.get(i).getCheckDev());
                Tblmouth.setIsNormal(list.get(i).getIsNormal());
                Tblmouth.setIsNormal(list.get(i).getIsNormal());
                Tblmouth.setUnusualDes(list.get(i).getUnusualDes());
                if (list.get(i).getDoctor().equals(1)){
                    Tblmouth.setDoctor("管理员");
                }
                Tblmouth.setExaminationDate(list.get(i).getExaminationDate());
            }

            if (OcService.AddOccService(Tblmouth)>0){
                mapTF.put("data","true");
            }else {
                mapTF.put("data","false");
            }
        }

        return JSONArray.toJSONString(mapTF);
    }

}
