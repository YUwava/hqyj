package com.athqyj.hqyj.Mapper.ym;

import com.athqyj.hqyj.entity.MInfo;
/*import com.athqyj.hqyj.service.ym.YmService;*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/informationquery")
public class InformationController {
    /*@Autowired
    private YmService ymService;
    *//*进入基础信息查询页面*//*
    @RequestMapping("/information")
    public String gologin(HttpServletRequest request){
        return "InformationQuery";
    }
    *//*查询所有档案信息*//*
    @RequestMapping("/getIndex")
    @ResponseBody
    public Object getIndex(Integer page, Integer limit) {
        List<MInfo> list = ymService.selectAllInfo(page,limit);
        System.out.println("更新时间    "+list.get(0).getdUpDate());
        int count = ymService.getAllCount();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", count);
        map.put("data", list);
       *//* for (int i=0;i<list.size();i++){
            System.out.println(list.get(i).getId());
            System.out.println(list.get(i).getName());
            System.out.println(list.get(i).getNumber());
        }*//*
        return map;
    }*/
}
