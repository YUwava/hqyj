package com.athqyj.hqyj.controller.ym;

import com.athqyj.hqyj.entity.MInfo;
import com.athqyj.hqyj.service.ym.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
    public Object getIndex(/*Integer autoId,*/Integer page, Integer limit) {
        List<MInfo> list = informationService.showAllInfoNice(/*autoId,*/page,limit);
    if(list.get(0).getlUptoprovince().get(0).getUpFlag()!=null){
            System.out.println("上传状态:"+list.get(0).getlUptoprovince().get(0).getUpFlag());
        }else {
            System.out.println("错误！");
        }
        int count = informationService.getAllCount();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", count);
        map.put("data", list);
      /*  String json= JSON.toJSONString(map);*/
        return map;
    }
}
