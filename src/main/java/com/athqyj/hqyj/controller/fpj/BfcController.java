package com.athqyj.hqyj.controller.fpj;

import com.alibaba.fastjson.JSONArray;
import com.athqyj.hqyj.entity.MInfo;
import com.athqyj.hqyj.service.fpj.BfcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("beforeCheck")
public class BfcController {

    @Autowired
    private BfcService BfcService;
    @RequestMapping("beforeCheck/nv")
    public String beforeChecknv(Model Model){
        Model.addAttribute("sex","nv");
        return "beforeCheck";
    }

    @RequestMapping("beforeCheck/nan")
    public String beforeChecknan(Model Model){
        Model.addAttribute("sex","nan");
        return "beforeCheck";
    }

    @GetMapping("Getbc.id")
    @ResponseBody
    public String  BfcQueryController(@RequestParam("ID")Long AutoId){
        Map<String, String> StringMap = new HashMap<String, String>();
        MInfo MInfo=BfcService.BfcqidService(AutoId);
        StringMap.put("ID",MInfo.getId());
        StringMap.put("fname",MInfo.getFname());
        StringMap.put("mname",MInfo.getMname());
        return JSONArray.toJSONString(StringMap);
    }
}
