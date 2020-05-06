package com.athqyj.hqyj.controller.fpj;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.athqyj.hqyj.entity.MInfo;
import com.athqyj.hqyj.entity.Tblmarriageresult;
import com.athqyj.hqyj.entity.Tblxray;
import com.athqyj.hqyj.service.fpj.CbService;
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
@RequestMapping("checkBear")
public class CbController {
    @Autowired
    private CbService CbService;

    @RequestMapping("checkBear/nv")
    public String ruleExpandnv(Model Model){
        Model.addAttribute("sexs","nv");
        return "checkBear";
    }

    @RequestMapping("checkBear/nan")
    public String ruleExpandnan(Model Model){
        Model.addAttribute("sexs","nan");
        return "checkBear";
    }

    @GetMapping("GetCb.id")
    @ResponseBody
    public String  GetXbCGETController(@RequestParam("ID")Long AutoId, @RequestParam("sexsing")String sex){
        Map<String, Object> StringMap = new HashMap<String, Object>();
            if(sex.equals("女")){
                Tblmarriageresult Tblmarriageresult=CbService.QueryCbService(AutoId,sex);
                if (Tblmarriageresult!=null) {
                    StringMap.put("id", Tblmarriageresult.getMInfo().getId());
                    StringMap.put("name", Tblmarriageresult.getMInfo().getFname());
                    StringMap.put("dates","true");
                    StringMap.put("Tblmarriageresult", Tblmarriageresult);
                }else {
                    MInfo MInfo=CbService.QueryCbsService(AutoId);
                    StringMap.put("id", MInfo.getId());
                    StringMap.put("name", MInfo.getMname());
                    StringMap.put("dates","false");
                }
            }
            if(sex.equals("男")){
                Tblmarriageresult Tblmarriageresult=CbService.QueryCbService(AutoId,sex);
                if (Tblmarriageresult!=null) {
                    StringMap.put("id", Tblmarriageresult.getMInfo().getId());
                    StringMap.put("name", Tblmarriageresult.getMInfo().getMname());
                    StringMap.put("dates","true");
                    StringMap.put("Tblmarriageresult", Tblmarriageresult);


                }else {
                    MInfo MInfo=CbService.QueryCbsService(AutoId);
                    StringMap.put("id", MInfo.getId());
                    StringMap.put("name", MInfo.getMname());
                    StringMap.put("dates","false");
                }
            }
        return JSONArray.toJSONString(StringMap);
    }

    @RequestMapping("addCb")
    @ResponseBody
    public String addBfcController(@RequestParam(value = "allParams")String data, @RequestParam("sexsing") String sex) {
        List<Tblmarriageresult> list = JSON.parseArray(data, Tblmarriageresult.class);
        Tblmarriageresult Tblmarriageresult=new Tblmarriageresult();
        Map<String,String> mapTF=new HashMap<>();
        if(sex.equals("nv")){
            for (int i=0;i<list.size();i++){
                Tblmarriageresult.setId(list.get(i).getId());
                Tblmarriageresult.setSex("女");
                Tblmarriageresult.setResult(list.get(i).getResult());
                Tblmarriageresult.setResultDes(list.get(i).getResultDes());
                Tblmarriageresult.setSickness(list.get(i).getSickness());
                Tblmarriageresult.setMedicalAdvice(list.get(i).getMedicalAdvice());
                Tblmarriageresult.setPrenubileConsult(list.get(i).getPrenubileConsult());
                Tblmarriageresult.setDirectResult(list.get(i).getDirectResult());
                Tblmarriageresult.setChangeHospital(list.get(i).getChangeHospital());
                Tblmarriageresult.setChangeHospitalDate(list.get(i).getChangeHospitalDate());
                Tblmarriageresult.setComeBackDate(list.get(i).getComeBackDate());
                Tblmarriageresult.setProvideDate(list.get(i).getProvideDate());
                Tblmarriageresult.setK1(list.get(i).getK1());
                Tblmarriageresult.setK2(list.get(i).getK2());
                Tblmarriageresult.setK3(list.get(i).getK3());
                Tblmarriageresult.setK4(list.get(i).getK4());
                Tblmarriageresult.setDotcorName(list.get(i).getDotcorName());
                Tblmarriageresult.setFillDate(list.get(i).getFillDate());
            }
            int count=CbService.count(Tblmarriageresult.getId(),Tblmarriageresult.getSex());
            if (count==1){
                if (CbService.updCbService(Tblmarriageresult)>0){
                    mapTF.put("data","true");
                }else {
                    mapTF.put("data","false");
                }
            }else {
                if (CbService.addcbService(Tblmarriageresult)>0){
                    mapTF.put("data","true");
                }else {
                    mapTF.put("data","false");
                }
            }

        }else if(sex.equals("nan")){
            for (int i=0;i<list.size();i++){
                Tblmarriageresult.setId(list.get(i).getId());
                Tblmarriageresult.setSex("男");
                Tblmarriageresult.setResult(list.get(i).getResult());
                Tblmarriageresult.setResultDes(list.get(i).getResultDes());
                Tblmarriageresult.setSickness(list.get(i).getSickness());
                Tblmarriageresult.setMedicalAdvice(list.get(i).getMedicalAdvice());
                Tblmarriageresult.setPrenubileConsult(list.get(i).getPrenubileConsult());
                Tblmarriageresult.setDirectResult(list.get(i).getDirectResult());
                Tblmarriageresult.setChangeHospital(list.get(i).getChangeHospital());
                Tblmarriageresult.setChangeHospitalDate(list.get(i).getChangeHospitalDate());
                Tblmarriageresult.setComeBackDate(list.get(i).getComeBackDate());
                Tblmarriageresult.setProvideDate(list.get(i).getProvideDate());
                Tblmarriageresult.setK1(list.get(i).getK1());
                Tblmarriageresult.setK2(list.get(i).getK2());
                Tblmarriageresult.setK3(list.get(i).getK3());
                Tblmarriageresult.setK4(list.get(i).getK4());
                Tblmarriageresult.setDotcorName(list.get(i).getDotcorName());
                Tblmarriageresult.setFillDate(list.get(i).getFillDate());
            }
            int count=CbService.count(Tblmarriageresult.getId(),Tblmarriageresult.getSex());
            System.out.println(count+"==================");
            if (count==1){
                if (CbService.updCbService(Tblmarriageresult)>0){
                    mapTF.put("data","true");
                }else {
                    mapTF.put("data","false");
                }
            }else {
                if (CbService.addcbService(Tblmarriageresult)>0){
                    mapTF.put("data","true");
                }else {
                    mapTF.put("data","false");
                }
            }
        }
        return JSONArray.toJSONString(mapTF);
    }
}
