package com.athqyj.hqyj.controller.ym;

import com.athqyj.hqyj.entity.LUptoprovince;
import com.athqyj.hqyj.entity.MInfo;
import com.athqyj.hqyj.service.ym.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/informations")
public class InformationController {

    @Autowired
    private InformationService informationService;
    /*进入基础信息查询页面*/
    @RequestMapping("/information")
    public String showgo(HttpServletRequest request){
        return "InformationQuery";
    }
    /*查询所有档案信息*/
    @RequestMapping("getIndex")
    @ResponseBody
    public Object getIndex(String fname,String mname,String midCard,String fidCard,String id,Integer page, Integer limit) {
        List<MInfo> list = informationService.showAllInfoNice(fname,mname,midCard,fidCard,id,page,limit);
        int count = informationService.getAllCount();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", count);
        map.put("data", list);
      /*  String json= JSON.toJSONString(map);*/
        return map;
    }

    /*状态信息表*/
    @RequestMapping("getUpInfos")
    @ResponseBody
    public Object getUpInfos() {
        List<LUptoprovince> list = informationService.geiUpInfo();
        return list;

    }



}
